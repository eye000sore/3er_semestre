package com.mycompany.ejercicos;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicos {
    
    public static void main(String[] args) {
    int medida, km, m, cm;
    try{
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la medida: ");
        medida = sc.nextInt();
    km = medida/100000;
    m = (medida%100000)/100;
    cm = medida%100;
    System.out.println("Esta medida tiene "+km+" kilometros "+m+" metros y "+cm+" centimetros");
    }catch(InputMismatchException ex){
        System.out.println("Ingrese datos validos!!!!");
    }
    }
}