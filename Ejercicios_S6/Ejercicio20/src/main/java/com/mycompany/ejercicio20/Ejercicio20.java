package com.mycompany.ejercicio20;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio20 {

    public static void main(String[] args) {
        int num, num2, potencia, opcion=1;
        Scanner sc = new Scanner(System.in);
        while(opcion!=0){
            try{
                System.out.println("Ingrese la base: ");
                num = sc.nextInt();
                System.out.println("Ingrese el exponente: ");
                num2 = sc.nextInt();
                if(num>=0 && num2>=0){
                    potencia = (int)Math.pow(num, num2);
                    System.out.println("E resultado de "+num+" elevado a "+num2+" es: "+potencia);
                    System.out.println("Desea continuar? (* si/0 no)");
                    opcion = sc.nextInt();
                }else{
                    System.out.println("Favor de ingresar valores validos!!!!");
                }
            }catch(InputMismatchException ex){
                System.out.println("Favor de ingresar valores validos!!!!");
                sc.nextLine();
            }
        }
    }
}
