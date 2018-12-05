/*
 * Ejercicio 11 - Tema 7
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] n = new int[10];
    int[] primo = new int[10];
    int[] noPrimo = new int[10];
    int i;
    int j;
    int primos = 0;
    int noPrimos = 0;
    boolean esPrimo = false;
    
    System.out.println("Introduzca 10 números separados por INTRO:");

    for (i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(s.nextLine());
      
      esPrimo = true; // Es primo o no.
      for (j = 2; j < n[i] - 1; j++) {
        if (n[i] % j == 0) {
          esPrimo = false;
        }
      }
      
      if (esPrimo) {
        primo[primos++] = n[i];
      } else {
        noPrimo[noPrimos++] = n[i];
      }
    }
    
    // Muestra el array original
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    // Los números primos se menten en las primeras
    // posiciones del array original.
    for (i = 0; i < primos; i++) {
      n[i] = primo[i];
    }
    
    // Los números que no son primos se colocan al final.
    for (i = primos; i < primos + noPrimos; i++) {
      n[i] = noPrimo[i - primos];
    }

    // Muestra el resultado.
    System.out.println("\n\nArray con los primos al principio:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
}
