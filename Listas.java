import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Listas {
    private int[] uno;
    private int[] dos;
    private int[] resta;
    private int[] producto;
    private int[] im_par;
    private boolean bool_1;
    private boolean bool_2;

    public Listas() {
        uno = new int[10];
        dos = new int[10];
        resta = new int[10];
        producto = new int[10];
        im_par = new int[10];
        bool_1 = false; 
        bool_2 = false;}
    
    public void lista_uno() {
        Random ran = new Random();
        for (int i = 0; i < uno.length; i++){
            uno[i] = ran.nextInt(20) + 1 ;}
            bool_1 = true;}

    public void lista_dos() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < dos.length; i++){
            do{
                System.out.print("ingrese un numero y" +(i + 1)+ " mayor a 5 y menor a 10: " );
                dos[i] = sc.nextInt();
            } while (dos[i] <= 5 || dos[i] >= 10);}
        bool_2 = true;
        sc.close();
    }

    public void lista_resta(){
        if (!bool_1 || !bool_2){
            System.out.println("No se han generado Listas previamente.");
            return;}
        for (int i = 0; i<resta.length; i++){
            resta [i] = uno[i] - dos[i];}
    }

    public void lista_producto(){
        if (!bool_1 || !bool_2){
            System.out.print("No se han generado Listas previamente.");
            return;}
        for (int i = 0; i< producto.length; i++){
            producto[i] = uno[i]*dos[i];}
    }

    public void lista_im_par(){
        if( !bool_1 || !bool_2){
            System.out.println("No se han generado Listas previamente.");
            return;}
        for (int i = 0; i< im_par.length; i++){
            int suma = uno[i] + dos[i]; 
            im_par[i] = suma%2 == 0 ? 1 : 0; }
    }

    public void mostrar_Listas() {
        System.out.println("Uno: " + Arrays.toString(uno));
        System.out.println("Dos: " + Arrays.toString(dos));
        System.out.println("Producto: " + Arrays.toString(producto));
        System.out.println("Resta: " + Arrays.toString(resta));
        System.out.println("im_par: " + Arrays.toString(im_par));
    }

    public static void main(String[] args){
        Listas op = new Listas();
        op.bool_1();
        op.bool_2();
        op.lista_resta();
        op.lista_producto();
        op.lista_im_par();
        op.mostrar_Listas();}
    }