package com.mycompany.main;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    public void Menu(){
    int opcion;
    int num1 = 0;
    int nume2 = 0;
    String cad1 = "";
    Recursion rc = new Recursion(num1, cad1, nume2);
    do{
    Scanner sc = new  Scanner(System.in);
        System.out.println("Menu_______________");
        System.out.println("Escoja una opción: ");
        System.out.println("1.- Contar números.");
        System.out.println("2.- Sumar dígitos.");
        System.out.println("3.- Minimo comun multiplo");
        System.out.println("4.- Revertir cadena.");
        System.out.println("0.- Salir del programa.");
        System.out.println("Ingrese la opcion");
        opcion = sc.nextInt();
        switch(opcion){
            case 1:
                try{
                System.out.println("Ingrese los numeros: ");
                num1 = sc.nextInt();
                rc.ContarNumeros(num1);
                } catch(InputMismatchException ex){
                    System.out.println("Ingrese numeros!!!!");
                }
            case 2:
                try{
                System.out.println("Ingrese los digitos: ");
                num1 = sc.nextInt();
                rc.SumaDigitos(num1);
                } catch(InputMismatchException ex){
                    System.out.println("Ingrese numeros!!!!");
                }
            case 3:
                try{
                System.out.println("Ingrese el primer numero: ");
                num1 = sc.nextInt();
                System.out.println("Ingrese el siguiente numero: ");
                nume2 = sc.nextInt();
                rc.MCD(num1, nume2);
                }catch(InputMismatchException ex){
                    System.out.println("Ingrese numeros!!!!");
                }
            case 4:
                try{
                System.out.println("Ingrese la palabra: ");
                cad1 = sc.next();
                rc.invertirCadena(cad1);
                } catch(InputMismatchException ex){
                    System.out.println("Ingrese letras!!!!");
                }
            default:
                System.out.println("Porfavor ingresar una oopción válida!!!!!!!");
        }
    }while(opcion != 0);
}
}