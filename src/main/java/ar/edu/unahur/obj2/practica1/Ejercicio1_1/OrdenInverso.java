package ar.edu.unahur.obj2.practica1.Ejercicio1_1;

import java.util.Scanner;

public class OrdenInverso {
    public static void main (String[]args) {
        int numeros[]  = new int [10];
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros: ");
        for(int i=0; i<numeros.length; i++) {
            numeros[i] = num.nextInt();
        }

        System.out.println("En orden inverso: ");
        for(int i=9; i>=0; i--){
            System.out.println(numeros[i]);
        }
    }
}
