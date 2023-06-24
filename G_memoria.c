#include <sys/types.h>
#include <sys/stat.h>
#include <sys/mman.h>
#include <fcntl.h>
#include <stdio.h>
#include <unistd.h>

int main(int argc, char *argv[]) {
  int i, fdo, fdd; // archivo de origen, archivo destino
  char *p, *q, *org, *dst;// apuntadores para copiar el archivo
  struct stat bstat;

  if (argc!=3){
    fprintf(stderr, "Uso: %s origen destino", argv[0]);
    return 1;
  }

  /*Abre el archivo origen para lectura*/
  if((fdo=open(argv[1],O_RDONLY))<0){ //si existe un error 
    perror("No se puede abrir archivo de origen");
    return 1;
  }

 /*Crea el archivo destino*/
  if((fdd=open(argv[2],O_CREAT|O_TRUNC|O_RDWR,640))<0){ //si existe un error 
    perror("No se puede crear archivo de destino");
    close(fdo);
    return 1;
  }
  /*Averigua la longitud del archivo origen*/
  if(fstat(fdo, &bstat)<0){ //si existe error cierra archivo origen y destino y borra el link
    perror("Error en fstat del archivo origen");
    close(fdo);
    close(fdd);
    unlink(argv[2]);
    return 1;
  }

  /*Establece que la longitud del archivo destino es igual a la del destino
  origen*/
  if(ftruncate(fdd, bstat.st_size)<0){
    perror("Error en truncate del archivo destino");
    close(fdo);
    close(fdd);
    unlink(argv[2]);
    return 1;
  }

  //Se proyecta el archivo de origen (1) origen
  //SHARED compartir la region de memoria qie se va a utilizar
    if((org= mmap((caddr_t) 0, bstat.st_size, PROT_READ, MAP_SHARED, fdo, 0))==MAP_FAILED){ //proyectar el arhivo en memoria, direccion long permisos, indicadores descriptor y direccion de desplazamiento,
      perror("Error en la proyeccion del archivo origen");
      close(fdo);
      close(fdd);
      unlink(argv[2]);
      return 1;
    }
  //se proyecta el archivo de origen (2) destino protegido para escritura
  if((dst= mmap((caddr_t)0, bstat.st_size, PROT_WRITE, MAP_SHARED, fdd, 0))==MAP_FAILED){
    perror("Error en la proyeccion del archivo destino");
    close(fdo);
    close(fdd);
    unlink(argv[2]);
    return 1;
  }

  //se cierran los archivos
  close(fdo);
  close(fdd);

  //bucle de copiar
  for(int i=0; i<bstat.st_size; i++){
    *q++ = *p++; //apunadores archivo origen/destino
  }

  //se eliminan las proyecciones
  munmap(org, bstat.st_size);
  munmap(dst, bstat.st_size);
  return 0;
}
