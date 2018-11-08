/*
 * Ejercicio 5 - Tema 7
 * Escribe un programa que pida 10 números por teclado y que luego muestre
 * los números introducidos junto con las palabras “máximo” y “mínimo” al lado
 * del máximo y del mínimo respectivamente.
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] numeros = new int[10];
    
    for (int i = 0; i < 10; i++) {
      
      System.out.print("Introduce un número: ");
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("------------------------");
    
    int maximo = numeros[0];
    int minimo = numeros[0];
    
    for (int i = 0; i < 10; i++) {
      
      if (numeros[i] < minimo) {
        
        minimo = numeros[i];
      }
      
      if (numeros[i] > maximo) {
        
        maximo = numeros[i];
      }
    }
    
    for (int i = 0; i < 10; i++) {
      
      System.out.print(numeros[i]);
      
      if (numeros[i] == minimo) {
        
        System.out.print(" minimo");
      }
      
      if (numeros[i] == maximo) {
        
        System.out.print(" maximo");
      }
      
      System.out.println();
    }
  }
}
