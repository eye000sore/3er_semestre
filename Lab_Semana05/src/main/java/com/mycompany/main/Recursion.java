package com.mycompany.main;

public class Recursion {
    private int numero;
    private String cadena;
    private int numero2;
    
    public Recursion(int nume,String cade, int nume2){
        numero = nume;
        cadena = cade;
        numero2 = nume2;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int nume){
        this.numero = nume;
    }
    public String getCadena(){
        return cadena;
    }
    public void setCadena(String cade){
        this.cadena = cade;
    }
    public int getNumero2(){
        return numero2;
    }
    public void setNumero2(int nume2){
        this.numero2 = nume2;
    }
    public int ContarNumeros(int nume){
        if (numero<10){
            return numero;
        }
        return 1+ContarNumeros(numero/10);
    }
    public int SumaDigitos(int nume){
        if (numero<10){
            return numero;
        }
        return numero%10 + SumaDigitos(numero/10);
    }
    public int MCD(int nume, int nume2) {
        if (numero2 == 0){
            return numero;
        }
        return MCD(numero2, numero % numero2);
    }
    public String invertirCadena(String cadena) {
        if (cadena == null || cadena.length() <= 1) {
            return cadena;
        }
        return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
    }
}
