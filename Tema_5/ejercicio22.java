/*
* Ejercicio 22 - Tema 5
* Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
*/
package tema_5;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class ejercicio22 {
  public static void main(String[] args) {
    
     Scanner s = new Scanner(System.in);
    
    System.out.print("Números primos entre 2 y 100: ");

    boolean primo = true;

    for (int n = 2; n <= 100; n++) {

      primo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          primo = false;
        }
      }

      if (primo) {
        System.out.print(n + " ");
      }
    }
    System.out.println();
  }
}
