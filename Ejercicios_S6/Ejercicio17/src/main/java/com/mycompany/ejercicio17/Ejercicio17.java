package com.mycompany.ejercicio17;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nume=0, incog=nume, factor=1, opcion=1;
        Factorial fc = new Factorial(nume, incog, factor);
        while (opcion!=0){
            try{
                int resultado = fc.calc_Factorial(nume, incog, factor);
                System.out.println(resultado);
                System.out.println("Desea continuar? (* si/0 no)");
                opcion = sc.nextInt(); 
            }catch(InputMismatchException ex){
                System.out.println("Favor de ingresar valores validos!!!!");
            }
        }
    }
}
