/*
 * 8. Realiza un programa que escoja al azar 10 cartas de la baraja
 *    española (10 objetos de la clase <code>Carta</code>). Emplea un
 *    objeto de la clase <code>ArrayList</code> para almacenarlas y
 *    asegúrate de que no se repite ninguna.
 */
package tema10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args) {
    ArrayList<Carta> a = new ArrayList<Carta>();
    Scanner s = new Scanner(System.in);
    
    Carta c = new Carta();
    
    a.add(c);
    boolean e;
		
    for (int i = 0; i < 9; i++) {			
      e = true;
			
      while (e) { 
	e = false;
	c = new Carta();
				
	for (Carta b : a) {
					
          if (b.equals(c)) {
            e = true;
          }
	}
      }
			
      a.add(c);
    }
		
    for (Carta b : a) {
      System.out.println(b);
    }
  } 
}
