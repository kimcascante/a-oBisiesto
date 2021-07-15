package Semana7;
/**
 * Nombre del programa: 
 * Descripcion: Haga un programa que determine, hasta que el usuario decida que no desea continuar,
    si un año es bisiesto o no. Un año es bisiesto si el múltiplo de 4, menos aquellos años
    que son múltiplos de 100. En estos casos el calendario gregoriano establece que un
    año que es múltiplo de cien es bisiesto solo si es divisible por 100 Y por 400.
    (Ejemplo, 1988,1992 y 1996 son bisiestos porque son divisibles entre 4. 1600, 2000 y
    2400 son bisiesto porque son divisibles por 100 y por 400; 1700, 1800, 1900 y 2100
    no son bisiestos porque son divisibles por 100 pero no por 400)
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej2w7 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{
        int ano;
        String resultado;
        int continuar=1;

        do{

            escribir.println("Digite el año a analizar:");
            ano=Integer.parseInt(leer.readLine());

            if((ano%4==0) && ((ano%100!=0) || (ano%400==0))){
                resultado = "El año es bisiesto";
            } else{
                resultado = "El año NO es bisiesto";
            }

            escribir.println(resultado);
            escribir.println();

            escribir.println("Digite 1 si desea continuar o 0 para salir");
            continuar=Integer.parseInt(leer.readLine());

        }while(continuar==1);
        
        
    }

}