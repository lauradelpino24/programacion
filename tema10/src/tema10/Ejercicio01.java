/*
 * 1. Crea un ArrayList con los nombres de 6 compañeros de clase. A
 *    continuación, muestra esos nombres por pantalla. Utiliza para
 *    ello un bucle for que recorra todo el ArrayList sin usar ningún
 *    índice.
 */
package tema10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    ArrayList<String> n = new ArrayList<String>();

    n.add("José Manuel");
    n.add("Salvador");
    n.add("Rubén");
    n.add("Irene");
    n.add("Noemí");
    n.add("Begoña");

    System.out.println("Contenido de la lista: ");

    for(String nombre : n) {
      System.out.println(nombre);
    }
  }
  
}
