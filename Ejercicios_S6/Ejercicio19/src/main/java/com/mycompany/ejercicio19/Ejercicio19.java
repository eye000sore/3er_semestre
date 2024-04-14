package com.mycompany.ejercicio19;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio19 {

    public static void main(String[] args) {
        int ladoA, perimetro, area, opcion=1;
        Scanner sc = new Scanner(System.in);
        while(opcion!=0){
            try{
                System.out.println("Ingrese la medida del lado: ");
                ladoA = sc.nextInt();
                if(ladoA>0){
                    perimetro = 4*ladoA;
                    area = ladoA*ladoA;
                    System.out.println("El perimetro es: "+perimetro+" El area es: "+area);
                    System.out.println("Desea continuar? (* si/0 no)");
                    opcion = sc.nextInt();
                }else{
                    System.out.println("Favor de ingresar datos validos!!!");
                    opcion = 1;
                }
            }catch(InputMismatchException es){
                System.out.println("Favor de ingresar datos validos!!!!");
                sc.nextLine();
            }
        }
    }
}
