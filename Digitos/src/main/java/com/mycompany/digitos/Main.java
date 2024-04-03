package com.mycompany.digitos;
import java.util.Scanner;
//import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int numero = sc.nextInt();
            NewClass obj = new NewClass(numero);
            obj.NumeroRecursivo(numero);
    }
}
