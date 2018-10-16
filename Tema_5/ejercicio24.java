/*
 * Ejercicio 24 - Tema 5
 * Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas.
 */
package tema_5;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class ejercicio24 {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa pinta una pirámide hecha a base de números.");
    System.out.print("Por favor, introduzca la altura de la pirámide:");
    int alturaIntroducida = Integer.parseInt(s.nextLine());

    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida - 1;
    
    while (altura <= alturaIntroducida) {
      
      for (i = 1; i <= espacios; i++) {
        System.out.print(" "); // espacios
      }
      
      // línea
      for (i = 1; i < altura; i++) {
        System.out.print(i); 
      }
      
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
    }
  }
  
}
