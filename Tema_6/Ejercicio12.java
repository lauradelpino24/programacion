/*
 * Ejercicio 12 - Tema 6
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 * con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
 * convertir un entero en un carácter.
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio12 {
  public static void main(String[] args) throws InterruptedException {
    Scanner s = new Scanner(System.in);

    int linea = 0;
    
    for(int i = 0; i < 8000; i++) {
      System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
      
      if (linea++ == 60) {
        linea = 0;
        Thread.sleep(50);
        System.out.println();
      }
    }
  }
 }
}