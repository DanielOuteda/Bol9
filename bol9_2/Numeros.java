/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_2;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */

// Realiza un programa que calcule a suma e o producto dos números comprendidos entre 10 e 90 .

public class Numeros {
    
    Scanner sc=new Scanner(System.in);
    
    public void Operaciones(){
        int contador = 10;
        int suma = 0;
        double producto = 1;

        while (contador < 90){
            suma = suma + contador;
            producto = producto * contador;
            contador = contador +1;
        }
        System.out.println("El resultado de la suma es = " + suma);
        System.out.println("El resultado de la multiplicación es = " + producto);
    }
}
