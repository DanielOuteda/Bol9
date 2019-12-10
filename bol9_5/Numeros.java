/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_5;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */

//    Implementa un programa no que se pida o número de elementos e, visualice a seguinte serie :
//      a)  2 + 4 + 6 + 8 + 10 …..
//      b)  - 1 + 2 – 3 + 4 – 5 + 6 …..
//      c)  0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 ………
    

public class Numeros {
    private int num;
    Scanner sc=new Scanner(System.in);
    
    public int pedirDatos(){
        System.out.println("Teclea numero: ");
        num=sc.nextInt();
        return num;
    }
    
    
}
