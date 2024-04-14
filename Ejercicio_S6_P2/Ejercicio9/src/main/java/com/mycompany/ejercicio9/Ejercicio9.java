package com.mycompany.ejercicio9;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio9 {

    public static void main(String[] args) {
        int diametro, opcion=1;
        double perimetro;
        Scanner sc = new Scanner(System.in);
            while(opcion!=0){
            try{
                System.out.println("Ingrese el diametro: ");
                diametro = sc.nextInt();
                if (diametro>0){
                    perimetro = Math.PI*(diametro);
                    System.out.println("El perimetro es "+perimetro+". Desea continuar?(* si/0 no)");
                    opcion = sc.nextInt();
                }else{
                    System.out.println("Favor de ingresar un numero valido!!1");
                    opcion = 1;
                }
            }catch(InputMismatchException ex){
                    System.out.println("Favor de ingresar numero, no letras!!!!!");
                    sc.nextLine();
            }
        }
    }
}
