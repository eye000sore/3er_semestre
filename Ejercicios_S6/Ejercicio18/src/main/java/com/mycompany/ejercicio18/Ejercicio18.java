package com.mycompany.ejercicio18;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio18 {

    public static void main(String[] args) {
        int num, largo, opcion=1;
        Scanner sc = new Scanner(System.in);
        while(opcion!=0){
            try{
                System.out.println("Ingrese el numero: ");
                num = sc.nextInt();
                String cade = String.valueOf(num);
                largo = cade.length();
                System.out.println("El largo es: "+largo+". Desea continuar(* si/0 no)");
                opcion = sc.nextInt();
            }catch(InputMismatchException es){
                System.out.println("Favor de ingresar datos validos!!");
                sc.nextLine();
            }
        }
    }
}
