package com.mycompany.palindrome;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String cadena1; 
    System.out.println("Ingrese la palabra palindrome: ");
    cadena1 = sc.next();
    int largoCadena = cadena1.length()-1;
    Palindrome pl = new Palindrome(cadena1);
    boolean palindrome = pl.esPalindrome(cadena1, 0, largoCadena);
    if (palindrome==true){
        System.out.println("La palabra es palindrome!!!!!");
    }
    else{
        System.out.println("La palabra no es palindrome, o quizas es lo ingresado no es valido ;(");
    }
  }
}
