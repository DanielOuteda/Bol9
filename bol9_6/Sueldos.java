package bol9_6;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doutedasolla
 */
public class Sueldos {

    private double cantidad;
    Scanner teclado = new Scanner(System.in);

    public Sueldos() {
    }

    public Sueldos(int cant) {
        cantidad = cant;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cant) {
        cantidad = cant;
    }

    public double pedirDato() {
        System.out.print("Introduce un sueldo: ");
        return teclado.nextDouble();
    }

    public void contabilidad() {
        double sueldo = pedirDato();
        int i = 0, j = 0, k = 0;
        while (sueldo != 0) {
            if ((sueldo >= 1000) && (sueldo <= 1750)) {
                i++;
            } else if (sueldo < 1000) {
                j++;
            }
            k++;
            sueldo = pedirDato();
        }
        System.out.println("Empleados que ganan entre 1000 e 1750 € => " + i);
        System.out.println("Porcentaje de traballadores que ganan menos de 1000 € => " + (j * 100) / k + "%");
    }
}
