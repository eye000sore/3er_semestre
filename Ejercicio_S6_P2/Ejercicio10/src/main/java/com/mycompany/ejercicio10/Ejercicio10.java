package com.mycompany.ejercicio10;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio10 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int ladoA, ladoB, opcion=1, area;
            while(opcion!=0){
                try{
                System.out.println("Ingrese la medida del Lado A: " );
                ladoA = sc.nextInt();
                System.out.println("Ingrese la medida del Lado B: ");
                ladoB = sc.nextInt();
                if(ladoA>0 && ladoB>0){
                    area = ladoA*ladoB;
                    System.out.println("El area es: "+area+". Desea continuar?(* si/0 no)");
                    opcion = sc.nextInt();
                }else{
                    System.out.println("Favor de ingresar valores validos!!!!!");
                    opcion=1;
                }
            }catch(InputMismatchException ex){
                    System.out.println("Favor de ingresar valores validos!!!!");
                    sc.nextLine();
            }
        }
    }
}