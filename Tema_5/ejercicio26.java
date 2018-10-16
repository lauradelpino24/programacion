/*
 * Ejercicio 26 - Tema 5
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 */
package tema_5;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class ejercicio26 {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero: ");
    int introducido = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca un dígito: ");
    int digito = Integer.parseInt(s.nextLine());

    System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + introducido + " en las siguientes posiciones: ");
    
    int numero = introducido;
    int cambio = 0;
    int longitud = 0;
    int posicion = 1;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      cambio = (cambio * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } 
        
    while (cambio > 0) {
      if ((cambio % 10) == digito) {
        System.out.print(posicion + " ");
      }
      cambio /= 10;
      posicion++;
    } 

    System.out.println();
  }
  
}
