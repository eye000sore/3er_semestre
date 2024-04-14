package com.mycompany.ejercicio17;
import java.util.Scanner;

public class Factorial {
    private int n, i, fact=1;
    public Factorial(int num,int in,int facto){
        this.n = num;
        this.i = in;
        this.fact = facto;
    }
    public int getN(){
        return n;
    }
    public void setN(int num){
        this.n = num;
    }
    public int getI(){
        return i;
    }
    public void setI(int in){
        this.i = in;
    }
    public int getFact(){
        return fact;
    }
    public void setFact(int facto){
        this.fact = facto;
    }
    public int calc_Factorial(int n, int i, int fact){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        n = sc.nextInt();
        for(i=n; i>0; i--){
            fact = fact*i;
        }
        return fact;
    }
}
