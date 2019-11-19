/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_4;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */

//Codifica un programa que solicite  un número e, visualice a táboa de multiplicar dese número.
//O programa rematara cando prememos o cero.

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
        num = pedirDatos();
        while (num != 0){
        while (contador < 10){
            contador = contador + 1;
            System.out.println(num+ "*" +contador+ "=" +(num*contador));
        }
        num = pedirDatos();
    }
}
}
