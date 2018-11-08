/*
 * Ejercicio 6 - Tema 7
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] numeros = new int[15];
    
    for (int i = 0; i < 15; i++) {
      
      System.out.print("Introduce un número: ");
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("\nAhora están desplazados:");
    
    int auxiliar = numeros[14];
    int indice = 1;
    
    for (int i = 14; i >= 0; i--) {
      
      if (i > 0) {
        
        numeros[i] = numeros[14 - indice];
        indice++;
        
      } else {
      
        numeros[0] = auxiliar;
      }
    }
    
    for (int i = 0; i < 15; i++) {
      
      System.out.print(numeros[i] + " ");
    }
  }
  
}
