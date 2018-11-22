
import java.util.Scanner;

/*
 * Ejercicio 5 - Tema 2
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 */

/**
 *
 * @author laura
 */
public class Ejercicio05 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    
    int pesetas = 10000;
    double euros = pesetas / 166.386;
    
    System.out.printf("%d pesetas son %.2f euros.\n", pesetas, euros);
  }
  
}
