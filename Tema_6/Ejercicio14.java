/*
 * Ejercicio 14 - Tema 6
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número
 * entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 * programa debe preguntar si el número que estás pensando es mayor o menor
 * que el que te acaba de decir.
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio14 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int oportunidades = 5;
    int numeroPensado;
    int minimo = 0;
    int maximo = 100;
    boolean acertado = false;
    int mayorMenorOIgual;
        
    System.out.println("Tengo 5 intentos para adivinar un número del 1 al 100 que tú pienses.");
    System.out.println("Dale a intro.");
    s.nextLine();

    do {
      numeroPensado = (int)(Math.random() * (maximo - minimo) + minimo);
      System.out.println("¿Es el " + numeroPensado + "?");
      System.out.println ("El número es:");
      System.out.println ("1) Mayor");
      System.out.println ("2) Menor");
      System.out.println ("3) Es correcto");
      mayorMenorOIgual = Integer.parseInt(s.nextLine());
      oportunidades--;

      if ( (mayorMenorOIgual == 1) && (oportunidades > 0) )
        minimo = numeroPensado + 1;
      
      if ( (mayorMenorOIgual == 2) && (oportunidades > 0) )
        maximo = numeroPensado - 1;
      
      if (mayorMenorOIgual == 3) {
        acertado = true;
        System.out.println("Siuuuu ¡he acertado!");
      }
    } while(!acertado && (oportunidades > 0));
    
    if (!acertado) {
      System.out.println("No lo he conseguido :( .");
    }
     
  }
}
