/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;
import java.util.Arrays;

/**
 *
 * @author pclab0.pc10
 */
public class Ordenamientos {
    private void MuestraArray(int [] a){
        for (int i=0;i<a.length;i++){
            System.out.print("["+a[i]+"]");
            }
        System.out.println("");
        System.out.println("");        
        }

    public void BubleSort(int [] a){
        int n = a.length;  
        int temp;
        int camb=0, comp=0;
        for(int i=0; i < n; i++){
            this.MuestraArray(a);
            System.out.println(camb+" cambios, "+comp+" comparaciones");
            for(int j=1; j < (n-i); j++){
                if(a[j-1] > a[j]){  
                    //Intercambio  
                    temp = a[j-1];  
                    a[j-1] = a[j];  
                    a[j] = temp;
                    camb++;
                    }
                comp++;
                }  
            }
        System.out.println("Complejidad de: "+n*n);
        }

    public void SelectionSort(int[] a) {
        int n = a.length;
        int comp;
        comp = 0;
        int camb = 0;
        for (int i = 0; i < n - 1; i++) {
            this.MuestraArray(a);
            System.out.println(comp+" Comparaciones, "+camb+" Cambios");
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[indiceMinimo]) {
                    indiceMinimo = j;
                    }
                comp++;
                }
            // Intercambiar arreglo[i] 
            //y arreglo[indiceMinimo]
            int temp = a[i];
            a[i] = a[indiceMinimo];
            a[indiceMinimo] = temp;
            camb++;
           }
        } 
        
    public void InsertionSort(int[] a) {
        int n = a.length, comp=0, camb=0;
        for (int i = 1; i < n; i++) {
            this.MuestraArray(a);
            System.out.println(comp+"comparaciones, "+camb+" cambios.");
            int valorActual = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > valorActual) {
                a[j + 1] = a[j];
                j--;
                camb++;
                }
            a[j + 1] = valorActual;
            comp++;
            }
        }

    public void ShellSort(int[] a) {      
        int n = a.length;
        double cplj = Math.pow((n*(Math.log10(n))),2);
        int incremento = n, comp=0,camb=0;
        do {
            this.MuestraArray(a);
            System.out.println("Comparaciones: "+comp+", Cambios: "+camb);
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < n; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && a[j] < a[j - incremento]) {
                        int tmp = a[j];
                        a[j] = a[j - incremento];
                        a[j - incremento] = tmp;
                        j -= incremento;
                        camb++;
                        }comp++;
                    }
                }
            } 
        while (incremento > 1);
        System.out.println("Lista ordenada: ");
        this.MuestraArray(a);
        System.out.println("Comparaciones: "+comp+", Cambios: "+camb);
        System.out.println("Nivel de complejidad (aprox): "+cplj);
        }
    
    public void mergeSort(int[] a) {
        if (a.length < 2) {return;}
        int mid = a.length / 2;
        int[] left = new int[mid];
        int[] right = new int[a.length - mid];
        //double cmplj = a.length*Math.log10(a.length);
 
        System.arraycopy(a, 0, left, 0, mid);
        System.arraycopy(a, mid, right, 0, a.length - mid);
 
        mergeSort(left);
        mergeSort(right);
        merge(a, left, right);
        //this.MuestraArray(a);  
        //System.out.println("Complejidad: "+cmplj);
        }
     
    
    public void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0, comp=0, camb=0;
        double cmplj = arr.length*Math.log10(arr.length);
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                camb++;
                i++;
            } else {
                arr[k] = right[j];
                camb++;
                j++;
            }
            k++;
            comp++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            comp++;
            camb++;
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            comp++;
            camb++;
            j++;
            k++;
        }
        
        comp++;
        this.MuestraArray(arr);
        System.out.println("Comparaciones: "+comp+", cambios: "+camb);
        System.out.println("Complejidad: "+cmplj);
        
    }
    
    public void quickSort(int[] arr){
        this.MuestraArray(arr);
        quick(arr, 0, arr.length-1);
        double cmplj = (arr.length)*Math.log10(arr.length);
        System.out.println("Complejidad: "+Arrays.toString(arr)+"-->"+cmplj);
    }
    public void quick(int[] arr, int inicio, int fin){
        if(inicio<fin){
            int indice = Partition(arr, inicio, fin);
            quick(arr, inicio, indice-1);
            quick(arr, indice+1 , fin);
        }
    }
    public int Partition(int[] arr, int inicio, int fin){
        int pivo = arr[fin], i = inicio-1, comp=0, camb=0;
        for(int j=inicio; j<fin; j++){
            if(arr[j]<=pivo){
                i++;
                comp++;
                int aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
                camb++;
                this.MuestraArray(arr);
                System.out.println("comparaciones: "+comp+", cambios: "+camb);
            }
        comp++;
        }
        int aux = arr[i+1];
        arr[i+1] = arr[fin];
        arr[fin] = aux;
        camb++;
        this.MuestraArray(arr);
        System.out.println("comparaciones: "+comp+", cambios: "+camb);
        return i+1;
    }
}
