/*
 * Ejercicio 1B - Tema 7
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio01B {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[][] num = new int[3][6];
    num [0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num [0][5] = 5;
    num [1][0] = 75;
    num [1][4] = 0;
    num [2][2] = -2;
    num [2][3] = 9;
    num [2][5] = 11;
    
    System.out.print("Array num");
    System.out.print(" ");// Para cuadrar las columnas
    
    for(int columna = 0; columna < 6; columna++){ // Columna
    System.out.print("  Columna "+ columna);
    }
    
    for(int fila = 0; fila < 3; fila++){ // Filas
    System.out.print("\n Fila" + fila);
    
      for(int columna = 0; columna < 6; columna++){
        System.out.printf("%9d   ", num[fila][columna]);
      }
    }
    System.out.println("");
  }
}
