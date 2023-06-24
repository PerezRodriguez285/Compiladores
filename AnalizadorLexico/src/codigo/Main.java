
package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception{
        String ruta="C:/Users/MI PC/Documents/NetBeansProjects/AnalizadorLexico/src/codigo/lexer.flex";
        String ruta2="C:/Users/MI PC/Documents/NetBeansProjects/AnalizadorLexico/src/codigo/lexerCup.flex";
        String[] rutaS = {"-parser", "Sintaxis", "C:/Users/MI PC/Documents/NetBeansProjects/AnalizadorLexico/src/codigo/Sintaxis.cup"};
        generar(ruta, ruta2, rutaS); //mandamos a llamar la ruta del proyecto
    }
    
    public static void generar(String ruta, String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo; 
        archivo = new File(ruta);//creamos un archivo donde se colocara la ruta
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);//tambien se crea para el archivo cup que se agrego anteriormente
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        //colocamos las rutas en el archivo
        Path rutaSym = Paths.get("C:/Users/MI PC/Documents/NetBeansProjects/AnalizadorLexico/src/codigo/sym.java");
        if(Files.exists(rutaSym)){
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:/Users/MI PC/Documents/NetBeansProjects/AnalizadorLexico/sym.java"), 
                Paths.get("C:/Users/MI PC/Documents/NetBeansProjects/AnalizadorLexico/src/codigo/sym.java")
        );
        
        Path rutaSin = Paths.get("C:/Users/MI PC/Documents/NetBeansProjects/AnalizadorLexico/src/codigo/Sintaxis.java");
        if(Files.exists(rutaSin)){
            Files.delete(rutaSin);
        }
        
        Files.move(
                Paths.get("C:/Users/MI PC/Documents/NetBeansProjects/AnalizadorLexico/Sintaxis.java"), 
                Paths.get("C:/Users/MI PC/Documents/NetBeansProjects/AnalizadorLexico/src/codigo/Sintaxis.java")
        );
    }
}
