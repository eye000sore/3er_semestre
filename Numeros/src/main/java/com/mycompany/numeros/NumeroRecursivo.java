package com.mycompany.numeros;

public class NumeroRecursivo {
    private String numero;
    public NumeroRecursivo(String nume){
        numero = nume;
    }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String nume){
        this.numero = nume;
    }
    public String Recursivo(String numero){
        if (numero.length()<=1){
            return numero;
        }
        return (Recursivo(numero.substring(1)) + numero.charAt(0));
    }
}
