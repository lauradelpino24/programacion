/*
 * Ejercicio 15 - Tema 8
 * Muestra los números primos que hay entre 1 y 1000.
 */
package tema8;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    for (int i = 1; i <= 1000; i++){
    
      if(PrimeraTandav2.esPrimo(i)){
      
        System.out.println(i);
      
      }  
    }
  }
}
