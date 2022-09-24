/*
Name: Edad3
Desciption: Escribe si es mayor de edad menor o no válida
Author: Granados Cruz Adrián
*/
import java.util.Scanner;
class Edad3{
    public static void main (String[] args){
        
        //INPUT
        final int EDAD_MAXIMA = 130;
        //Constante
        int edad;
        Scanner scanner;
        scanner = new Scanner(System.in);
        String mensaje = "";
        //PROCESS
        System.out.print("Introduce la edad");
        edad = scanner.nextInt();
        if (edad >= 18 && edad < EDAD_MAXIMA){
            mensaje = "Eres mayor de edad";
        }
        else if (edad > 0 && edad < 18){
            mensaje = "Eres menor de edad";
        }
    }
}