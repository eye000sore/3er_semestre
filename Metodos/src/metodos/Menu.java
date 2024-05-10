package metodos;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {

    public void Menu(){
        int opcion=9;
        Ordenamientos m = new Ordenamientos(); 
        Scanner sc = new Scanner(System.in);
        int array[] = {54,26,93,17,77,31,44,55,20};  
        while(opcion!=0){
            System.out.println("Menu____________");
            System.out.println("1.- Metodo burbuja");
            System.out.println("2.- Metodo Selección");
            System.out.println("3.- Metodo Insercion");
            System.out.println("4.- Metodo Shell");
            System.out.println("5.- Metodo Merge");
            System.out.println("0.- Salir del programa");
            try{
                System.out.println("Con que metodo desea ordenar la lista");
                opcion = sc.nextInt();
                switch(opcion){
                    case 1 :
                        System.out.println("Metodo Burbuja:");
                        m.BubleSort(array);
                        break;
                    case 2 :
                        System.out.println("Metodo Selección");
                        m.SelectionSort(array);
                        break;
                    case 3:
                        System.out.println("Metodo de inserción");
                        m.InsertionSort(array);
                        break;
                    case 4:
                        System.out.println("Metodo Shell");
                        m.ShellSort(array);
                        break;
                    case 5:
                        System.out.println("Metodo Merge: ");
                        m.mergeSort(array);
                        break;
                    case 6:
                        System.out.println("Metodo Quick: ");
                        m.quickSort(array);
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Favor de ingresar valores validos!!!");
                        opcion = 9;
                        break;
                }
            }catch(InputMismatchException ex){
                System.out.println("Favor de ingresar valores validos!!!");
            }
        }
    }
}
