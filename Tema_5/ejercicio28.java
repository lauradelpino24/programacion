/*
 * Ejercicio 28 - Tema 5
 * Escribe un programa que calcule el num de un número entero leído por
 * teclado.
 */
package tema_5;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class ejercicio28 {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int introducido;
    
    do {
      System.out.print("Por favor, introduzca un número entero: ");
      introducido = Integer.parseInt(s.nextLine());
      
      if (introducido < 0) {
        System.out.println("El número introducido no es correcto.");
      }
    } while (introducido < 0);

    int num = introducido;
    
    if (introducido == 0) {
      System.out.println("El num del " + introducido + " es 1.");
    } else {
      for (int i = 1; i < introducido; i++) {
        num *= i;
      }

      System.out.println(introducido + "! = " + num);
    }
  }
}
