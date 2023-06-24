#include<stdio.h>
#include<conio.h>

int main(){
	int n, i, qt, count=0, temp, sq=0, bt[10], wt[10], tat[10], rem_bt[10];
	float awt=0, atat=0;
	
	printf("Ingrese el numero de procesos: ");
	scanf("%d",&n);
	printf("Ingrese el numero de procesos: ");
	for(i=0;i<n;i++){ //se encarga de ordenar el numero de procesos
		scanf("%d",&bt[i]);
		rem_bt[i]=bt[i];
	}
	printf("Ingresa el quantum del tiempo:");
	scanf("%d",&qt);
	while(1){
		for(i=0,count=0;i<n;i++){ //permite establecer el tiempo en que van a tardar los procesos
			temp=qt;
			if(rem_bt[i]==0){ //si el tiempo es igual a 0 el contador sigue incrementando
				count++;
				continue;
			}
			if(rem_bt[i]>qt) //si el tiempo es mayor el quantum resta el tiempo del proceso
				rem_bt[i]=rem_bt[i]-qt;
			else
				if(rem_bt[i]>=0){//en caso contrario el temp se iguala al proceso
					temp=rem_bt[i];
					rem_bt[i]=0;
				}
				sq=sq+temp;
				tat[i]=sq;
		}
		if(n==count)
			break;
	}
	printf("\nProceso\t\tTiempo en reposo\tTiempo de respuesta\tTiempo de espera\n");
	for(i=0;i<n;i++){ //se muestran los resultados del proceso
		wt[i]=tat[i]-bt[i];//se almacenan los resultados en arreglos
		awt=awt+wt[i];//resultado del tiempo de espera del proceso 
		atat=atat+tat[i];//resultado del tiempo de respuesta del proceso
		printf("\n%d\t\t%d\t\t\t%d\t\t\t%d",i+1,bt[i],tat[i],wt[i]);
	}
	awt=awt/n;
	atat=atat/n; //se dividen los tiempos entre el numero de procesos
	printf("\nPromedio del tiempo de espera=%f\n",awt);
	printf("Promedio del tiempo de respuesta=%f",atat);
	getch();
	return 0;
}
