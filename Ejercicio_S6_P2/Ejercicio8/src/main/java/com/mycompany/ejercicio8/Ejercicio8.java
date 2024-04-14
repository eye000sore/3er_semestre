package com.mycompany.ejercicio8;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio8 {

    public static void main(String[] args) {
        int radio, opcion=1;
        double area;
        Scanner sc = new Scanner(System.in);
        while(opcion!=0){
            try{
            System.out.println("Ingrese el radio: ");
            radio = sc.nextInt();
            if(radio>0){
                area = (double)(Math.PI*(radio*radio));
                System.out.println("El area aproximada del circlo es: "+area+". Desea continuar?(* si/0 no)");
                opcion = sc.nextInt();
            }else{
                System.out.println("Ingresar un valor valido!!!");
                opcion = 1;
            }
        }catch(InputMismatchException ex){
                System.out.println("Favor de ingresar valores validos!!!");
                sc.nextLine();
        }
    }
}
}
