/*
 * Ejercicio 4 - Tema 6 
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
 * por espacios.
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    for (int i = 0; i < 20; i++) {
      System.out.print((int)(Math.random()*11) + " ");
    }
    
    System.out.println();
  }
  
}
