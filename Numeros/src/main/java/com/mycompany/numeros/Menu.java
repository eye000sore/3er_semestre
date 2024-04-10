package com.mycompany.numeros;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    public void Menu(){
        String numero="";
        Scanner sc = new Scanner(System.in);
        NumeroRecursivo nr = new NumeroRecursivo(numero);
        try{
            System.out.println("Ingrese el numero: ");
            numero = sc.next();
            String resultado = nr.Recursivo(numero);
            System.out.print(resultado);
        }catch(InputMismatchException ex){
            System.out.println("Ingrese un valor valido!!!!!!");
        }
}
}
