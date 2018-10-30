/*
 * Ejercicio 1 - Tema 6
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int dado1 = 0;

    int dado2 = 0;

    int dado3 = 0;

    for(int i = 0; i<=1; i++){
      dado1 = (int)(Math.random()*6) + 1;
      dado2 = (int)(Math.random()*6) + 1;
      dado3 = (int)(Math.random()*6) + 1;
    }

    int total = dado1 + dado2 + dado3;

    System.out.println("El dado nº1: " + dado1);
    System.out.println("El dado nº2: " + dado2);
    System.out.println("El dado nº3: " + dado3);
    System.out.println("La suma de todos los dados es: " + total);
  }
  
}
