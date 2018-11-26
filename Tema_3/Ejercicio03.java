
import java.util.Scanner;

/*
 * Ejercicio 3 - Tema 3
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 */

/**
 *
 * @author laura
 */
public class Ejercicio03 {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la cantidad de pesetas: ");
    int pesetas = Integer.parseInt(s.nextLine());
    double euros = pesetas / 166.386;
    
    System.out.printf("%d pesetas son %.2f euros.\n", pesetas, euros);
  }
  
}
