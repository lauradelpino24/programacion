/*
 * Ejercicio 7 - Tema 7
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces
 * por teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente. Los números
 * que se han cambiado deben aparecer entrecomillados.
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] numero = new int[100];
    
    // Números aleatorios
    for (int i = 0; i < 100; i++) {
      numero[i] = (int)(Math.random()*21);
      System.out.print(numero[i] + " ");
    }
    System.out.println();
    
    System.out.print("Por favor, elija el valor que desea cambiar: ");
    int valor1 = Integer.parseInt(s.nextLine());
    System.out.print("Por favor, elija el valor al que cambiar: ");
    int valor2 = Integer.parseInt(s.nextLine());
    
    for (int i = 0; i < 100; i++) {
      
      if (numero[i] == valor1) {
        
        numero[i] = valor2;
        System.out.print("\""+ numero[i] + "\" ");
      } else{
      
      System.out.print(numero[i] + " ");
      }
    }
    
    System.out.println();
  }
}
