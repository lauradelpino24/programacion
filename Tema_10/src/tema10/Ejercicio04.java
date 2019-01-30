
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * 4. Realiza un programa equivalente al anterior pero en esta ocasión,
 *    el programa debe ordenar palabras en lugar de números.
 */


public class Ejercicio04 {


  public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<String>();
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca 10 palabras: ");
    
    for (int i = 0; i < 10; i++) {
      a.add((s.nextLine()));
    }

    System.out.println("Original:\n" + a);

    Collections.sort(a);

    System.out.println("Ordenado alfabéticamente:" + a);
    
  }
  
}

