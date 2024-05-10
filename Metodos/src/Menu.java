import java.util.Scanner;
import metodos.Ordenamientos;
import java.util.InputMismatchException;

public class Menu {
    public void Menu(){
        int opcion=0;
        Ordenamientos m = new Ordenamientos(); 
        Scanner sc = new Scanner(System.in);
        int array[] = {54,26,93,17,77,31,44,55,20};  
        while(opcion!=0){
            System.out.println("Menu____________");
            System.out.println("1.- Metodo burbuja");
            System.out.println("2.- Metodo Selección");
            System.out.println("3.- Metodo Insercion");
            System.out.println("4.- Metodo Shell");
            System.out.println("5.- Metodo Merge sort");
            System.out.println("6.- Metodo Merge");
            System.out.println("0.- Salir del programa");
            try{
                System.out.println("Con que metodo desea ordenar la lista");
                opcion = sc.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("Metodo Burbuja:");
                        m.BubleSort(array);
                    case 2:
                    default:
                        System.out.println("Favor de ingresar valores validos!!!");
                        opcion = 9;
                }
            }catch(InputMismatchException ex){
                System.out.println("Favor de ingresar valores validos!!!");
            }
        }
    }
}
