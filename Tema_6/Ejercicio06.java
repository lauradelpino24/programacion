/*
 * Ejercicio 6 - Tema 6
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número introducido
 * es menor o mayor que el número secreto.
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio06 {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   
   int numero = (int)(Math.random()*101);

      int adivina = 0;

      for(int i = 1; ((numero!=adivina)&&(i<=5)); i++){

        System.out.println("Adivine el numero de entre 0-100: ");
        adivina = Integer.parseInt(s.nextLine());

        if (adivina==numero){
          System.out.println("Ha acertado el numero.");
        }else if (adivina < numero){
          System.out.println("El numero a adivinar es mayor que el introducido.");
        }else if (adivina > numero){
          System.out.println("El numero a adivinar es menor que el introducido.");
        }

        System.out.println("Intentos realizados: "+i+ " ,Maximo de intentos 5.");
      }
  }
  
}
