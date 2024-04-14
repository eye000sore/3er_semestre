package com.mycompany.ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {
        int i=0, suma=0;
        while (i<=400){
            if(i%2!=0){
                suma+=i;
            }
            i++;
        }
        System.out.println("La suma es: "+suma);
    }
}
