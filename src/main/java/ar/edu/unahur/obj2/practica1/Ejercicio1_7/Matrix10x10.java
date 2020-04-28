package ar.edu.unahur.obj2.practica1.Ejercicio1_7;

import java.util.Random;
import java.util.Scanner;

public class Matrix10x10 {
    public static void main(String[] args) {

        Datos dato = new Datos();

        dato.ingresaDatos();

        dato.muestraDatos();

    }
}

class Datos{
    Scanner ingreso = new Scanner(System.in);
    int [][] numeros = new int[10][10];

    void ingresaDatos (){
        //System.out.println("Próximo a ingresar los valores de las filas \n");
        Random r = new Random();
        for(int i=0;i<numeros.length;i++){
            for(int j=0;j<numeros[i].length;j++){
                numeros[i][j] = r.nextInt(100) ;
            }
        }
        System.out.println();
    }

    void muestraDatos(){
        System.out.println("Próximo a ingresar los valores de la matriz 10x10: ");
        String tipo = " %3d ";
        for(int i=0;i<numeros.length;i++){
            System.out.println();
            for(int j=0;j<numeros.length;j++){
                System.out.format(tipo,numeros[i][j]);
            }
        }
    }
}
