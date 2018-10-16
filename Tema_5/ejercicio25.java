/*
 * Ejercicio 25 - Tema 5
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 */
package tema_5;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class ejercicio25 {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número entero: ");
    int introducido = Integer.parseInt(s.nextLine());

    int num = introducido;
    int cambio = 0;
    
    while (num > 0) {
      cambio = (cambio * 10) + (num % 10);
      num /= 10;
    } 
    
    System.out.println("Si le damos la vuelta al " + introducido + " tenemos el " + cambio);
  }
  
}
