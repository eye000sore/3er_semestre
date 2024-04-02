package com.mycompany.palindrome;

public class Palindrome {
    private String cadena;
    public Palindrome(String cadena1){
        cadena = cadena1;
    }
    public String getCadena(){
        return cadena;
    }
    public void setCadena(String cadena1){
        this.cadena = cadena1;
    }
    public boolean esPalindrome(String cadena, int inicio, int fin){
       if (inicio>=fin){
           return true;
       }           
      else if (cadena.charAt(inicio) != cadena.charAt(fin)){
       return false;
               }
       return esPalindrome(cadena, inicio+1, fin-1);
   }
}
