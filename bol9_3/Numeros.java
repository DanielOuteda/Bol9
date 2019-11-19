/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_3;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */

    // Implementa un programa que calcule o área dun rectángulo cuxa base e altura pides por teclado.
    // Asegurate que estos valores sexan positivos , para eso valida os datos .

public class Numeros {
    private int base;
    private int altura;
    Scanner sc=new Scanner(System.in);
    
    public int pedirBase(){
        System.out.println("Teclea la base: ");
        base=sc.nextInt();
        return base;
    }
    
    public int pedirAltura(){
        System.out.println("Teclea la altura: ");
        altura=sc.nextInt();
        return altura;
    }
    
    public void Operaciones(){
       base=pedirBase();
       while (base<0){
           System.out.println("Dato no válido");
           base=pedirBase();
       }
       altura=pedirAltura();
       while (altura<0){
           System.out.println("Dato no válido");
           altura=pedirAltura();
       }
        System.out.println("El area del rectangulo es:" + base * altura);
    }
}
