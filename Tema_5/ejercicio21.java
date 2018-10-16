/*
 *Ejercicio 21 - Tema 5
 *Un programa que vaya pidiendo números hasta que se introduzca un numero
 *negativo y nos diga cuantos números se han introducido, la media de los 
 *impares y el mayor de los pares.
 */
package tema_5;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class ejercicio21 {
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca números enteros.");
    
    int introducido;
    int elementos = 0;
    int sumaImpares = 0;
    int impares = 0;
    int maximoPar = 0;
    
    do {
      introducido = Integer.parseInt(s.nextLine());
      
      if (introducido >= 0) {
        elementos++;
        if ((introducido % 2) == 1) { 
          sumaImpares += introducido;
          impares++;
        } else { 
          if (introducido > maximoPar)
            maximoPar = introducido;
        }
      }
    } while (introducido >= 0);

    System.out.println("Ha introducido " + elementos + " números");
    System.out.println("La media de los impares es " + sumaImpares/impares);
    System.out.println("El máximo de los pares es " + maximoPar);
    
  }
}
