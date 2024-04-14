package com.mycompany.ejercicio12;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio12 {

    public static void main(String[] args) {
        int ladoA, perimetro, area, opcion=1;
        Scanner sc = new Scanner(System.in);
        while(opcion!=0){
            try{
                System.out.println("Ingrese la medida del lado: ");
                ladoA = sc.nextInt();
                if(ladoA>0){
                    perimetro = 12*ladoA;
                    area = 6*(ladoA*ladoA);
                    System.out.println("El perimetro es: "+perimetro+" y el area es: "+area);
                    System.out.println("Desea continuar? (* si/0 no)");
                    opcion = sc.nextInt();
                }else{
                    System.out.println("Favor de ingresar valores validos!!");
                    opcion = 1;
                }
            }catch(InputMismatchException ex){
                System.out.println("Favor de ingresar valores validos!!!");
                sc.nextLine();
            }
        }
    }
}
