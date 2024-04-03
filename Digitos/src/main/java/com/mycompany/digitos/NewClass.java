package com.mycompany.digitos;

public class NewClass {
    private int numero;
    public NewClass(int num){
    numero = num;
}
    public int getNumero(){
        return numero;
    }
    public void setNumero(int num){
        this.numero = num;
    }
    public int NumeroRecursivo(int numero){
        if (numero < 10) {
            return numero;
        }else{
        int ultimoDigito = numero % 10;
        int resto = numero / 10;
        int numeroInvertido = NumeroRecursivo(resto);
        return Integer.parseInt(String.valueOf(ultimoDigito) + String.valueOf(numeroInvertido));
        }
    }
}
