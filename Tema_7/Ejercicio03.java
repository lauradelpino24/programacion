/*
 * Ejercicio 3 - Tema 7
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio03 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] numeros = new int[10];
    
    for (int i = 0; i < 10; i++) {
      
      System.out.print("Introduce un número: ");
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("\nAhora están al revés: ");
    
    for (int i = 9; i >= 0; i--) {
      
      System.out.print(numeros[i] + " ");
    }
  }
}
