package com.mycompany.ejercicio5;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma=0, cont;
        try{
            for(cont=0; cont<=30; cont++){
                System.out.println("Ingrese un numero: ");
                num = sc.nextInt();
                suma+=num;
            }
            if(cont!=0){
                System.out.println("El promedio es: "+(suma/cont));
            }
        }catch(InputMismatchException es){
            System.out.println("Favor de ingresar valores validos");
        }
    }
}
