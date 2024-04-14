package com.mycompany.ejercicio11;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=1, radio;
        double volumen;
        while(opcion!=0){
            try{
                System.out.println("Ingrese el radio de la esfera: ");
                radio = sc.nextInt();
                if(radio>0){
                    volumen = (4/3)*Math.PI*(radio*radio*radio);
                    System.out.println("El volumen es: "+volumen+". Desea continuar? (* si/0 no)");
                    opcion = sc.nextInt();
                }else{
                    System.out.println("Favor de ingresar valores validos");
                }
            }catch(InputMismatchException ex){
                System.out.println("Favor de ingresar valores validos!!!!");
                sc.nextLine();
            }
        }
    }
}
