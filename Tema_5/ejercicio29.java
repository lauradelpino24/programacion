/*
 * Ejercicio 29 - Tema 5
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 */
package tema_5;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class ejercicio29 {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número entero positivo (relativamente grande): ");
    int numMayor = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca otro número (relativamente pequeño): ");
    int numMenor = Integer.parseInt(s.nextLine());

    System.out.print("Los números enteros positivos menores que " + numMayor );
    System.out.println(" que no son divisibles entre " + numMenor + " son los siguientes:");

    int cuenta = 0;
    int suma = 0;

    for (int i = 1; i < numMayor; i++) {
      if ((i % numMenor) != 0) {
        System.out.print(i + " ");
      }
    }
  }
}
