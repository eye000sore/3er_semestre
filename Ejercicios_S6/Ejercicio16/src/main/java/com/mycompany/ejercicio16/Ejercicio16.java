package com.mycompany.ejercicio16;

public class Ejercicio16 {

    public static void main(String[] args) {
        int i;
        for(i=1; i<=100; i++){
            if(i%3!=0){
                System.out.println(i);
            }else if(i%3==0){
                System.out.println("Cuek");
            }
        }
    }
}
