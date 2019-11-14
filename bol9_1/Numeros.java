/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_1;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Numeros {
    private int num;
    Scanner sc=new Scanner(System.in);
    
    public int pedirDatos(){
        System.out.println("Teclea numero: ");
        num=sc.nextInt();
        return num;
    }
    
    public void verCantidade(){
        int contador = 0;
        int contadorplus = 0;
        int contadorminus = 0;
        int contadorcero = 0;
        
        while (contador <= 10){
            num = pedirDatos();
            contador = contador + 1;
            if (num>0){
                contadorplus = contadorplus +1;
            }
            else if (num<0){
                contadorminus = contadorminus +1;
            }
            else {
                contadorcero = contadorcero +1;
            }    
        }
        System.out.println("Numeros positivos = "+ contadorplus+ "\nNumeros negativos = " + contadorminus +"\nCeros = "+ contadorcero);
    }
}