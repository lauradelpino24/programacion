/*
 * Ejercicio 31 - Tema 5
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno.
 */
package programacion.Tema_5;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class ejercicio31 {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la L: ");
    int altura = Integer.parseInt(s.nextLine());
    
    int horizontal = (altura /2) +1;
    
    for (int i = 1; i < altura; i++) {
      System.out.println("*");
      }
    
    for (int i = 0; i < horizontal; i++) {
      System.out.print("* ");
    } 
  }
}
