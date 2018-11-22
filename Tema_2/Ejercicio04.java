
import java.util.Scanner;

/*
 * Ejercicio 4 - Tema 2
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 */

/**
 *
 * @author laura
 */
public class Ejercicio04 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    
    int euros = 21;
    int pesetas = (int) (euros * 166.386);
    
    System.out.print(euros + " euros son " + pesetas + " pesetas.");
  }
  
}
