/*
 * Ejercicio 23 - Tema 5
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 */
package tema_5;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class ejercicio23 {
 
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce los números.");
    System.out.println("Acaba ciando la suma de los números sea mayor que 10000.");
    
    int introducido;
    int suma = 0;
    int elementos = 0;
    
    do {
      introducido = Integer.parseInt(s.nextLine());
      suma += introducido;
      elementos++;
    } while (suma <= 10000);
    
    System.out.println("Ha introducido un total de " + elementos + " números.");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / elementos + ".");
  }
  
}
