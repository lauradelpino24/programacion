/*
 * Ejercicio 13 - Tema 6
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int dado1 = 0;
    int dado2 = 0;
    
    do {
      dado1 = (int)(Math.random() * 6) + 1;
      dado2 = (int)(Math.random() * 6) + 1;
      System.out.println(dado1 + " " + dado2);
    } while (dado1 != dado2);
  }
}
