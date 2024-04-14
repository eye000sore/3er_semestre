package com.mycompany.ejercicio4;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio4 {

        public static void main(String[] args) {
            int numero, opcion=1;
            Scanner sc = new Scanner(System.in);
            while(opcion!=2){
                try{
                System.out.println("Ingrese el numero: ");
                numero = sc.nextInt();
                if(numero%2==0){
                    System.out.println("El numero es par, desea ingresar un numero?(1 si/2 no)");
                    opcion=sc.nextInt();
                }else{
                    System.out.println("El numero no es par, desea ingresar otro numero? (1 si/2 no)");
                    opcion=sc.nextInt();
                }
                }catch(InputMismatchException ex){
                    System.out.println("Favor de ingresar valores validos!!!!!");
            }
        }
    }
}