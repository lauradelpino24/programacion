/*
 * Ejercicio 12 - Tema 7
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
 * ambos números están entre 0 y 9. El programa deberá colocar el número de
 * la posición inicial en la posición final, rotando el resto de números para que no
 * se pierda ninguno. Al final se debe mostrar el array resultante.
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] n = new int[10];
    int[] resultado = new int[10];
    int inicio;
    int numeroFinal;
    
    System.out.println("Introduzca 10 números separados por INTRO:");

    for (int i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println("Array original: ");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println();
    
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    
    System.out.println("");
    
    System.out.print("Introduzca la posición inicial (0 - 9): ");
      inicio = Integer.parseInt(s.nextLine());
      if ((inicio < 0) || (inicio > 9)) {
        System.out.println("Valor incorrecto, debe ser un número entre el 0 y el 9.");
      }
    System.out.println("");
    
    System.out.print("Introduzca la posición final (0 - 9): ");
      numeroFinal = Integer.parseInt(s.nextLine());
      if ((numeroFinal < 0) || (numeroFinal > 9)) {
        System.out.println("Valor incorrecto, debe ser un número entre el 0 y el 9.");
      }
  }
  
}
