/*
 * Ejercicio 33 - Tema 5
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
 * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 * dos asteriscos menos en la base para simular la curvatura de las esquinas
 * inferiores.
 */
package programacion.Tema_5;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class ejercicio33 {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la U: ");
    int altura = Integer.parseInt(s.nextLine());
    
    int base = altura -2; 
    
    for (int i = 1; i < altura; i++) { // laterales
      System.out.print("*");
      
      for (int j =0; j < base; j++){ // pinta los espacios entre los laterales
        
        System.out.print(" ");
        
      }
      System.out.println("*");
    }
    
    System.out.print(" ");
    for (int k = 0; k < base; k++) { // base
      System.out.print("*");
    }
    
    System.out.println();
 }
}
