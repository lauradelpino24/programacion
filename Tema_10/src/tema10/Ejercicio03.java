/*
 * 3. Escribe un programa que ordene 10 números enteros introducidos por
 *    teclado y almacenados en un objeto de la clase ArrayList .
 */
package tema10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio03 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    ArrayList<Integer> a = new ArrayList<Integer>();
    
    System.out.println("Introduzca 10 números enteros: ");
    
    for (int i = 0; i < 10; i++) {
      a.add(Integer.parseInt(s.nextLine()));
    }
    
    System.out.println("Original: " + a);
    
    Collections.sort(a);
    
    System.out.println("Ordenado de menor a mayor: " + a);
    
  }
  
}
