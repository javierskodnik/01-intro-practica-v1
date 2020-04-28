package ar.edu.unahur.obj2.practica1.Ejercicio1_6;
import java.util.Scanner;

public class Matrix3x3 {
    public static void main(String[] args) {

        Datos dato=new Datos();

        dato.ingresaDatos();

        dato.muestraDatos();

    }

}

class Datos{
    Scanner ingreso = new Scanner(System.in);

    // hago por variable para dar la posibilidad de deinir una matrix con otros valores

    int columnas = 4;
    int filas = 3;

    int [][] numeros = new int[filas][columnas];

    void ingresaDatos (){
        System.out.println("Próximo a ingresar los valores de las filas \n");
        for(int i=0; i<numeros.length; i++){
            System.out.println("Ingrese los valores de la fila n° "+(i+1));
            for(int j=0;j<numeros[i].length; j++){
                System.out.print("Ingrese el "+(j+1)+" dato: ");
                numeros[i][j]=ingreso.nextInt();
            }
        }
        System.out.println();
    }

    void muestraDatos(){
        System.out.println("Próximo a ingresar los valores de la matriz 3x3: ");
        String tipo = " %3d ";
        for(int i=0;i<numeros.length;i++){
            System.out.println();
            for(int j=0;j<numeros[i].length;j++){
                System.out.format(tipo,numeros[i][j]);
            }
        }

    }
}
