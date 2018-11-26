
import java.util.Scanner;

/*
 * Ejercicio 2 - Tema 3
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 */

/**
 *
 * @author laura
 */
public class Ejercicio02 {

  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    
    System.out.print("Introduzca la cantidad de euros: ");
    int euros = Integer.parseInt(s.nextLine());
    int pesetas = (int) (euros * 166.386);
    
    System.out.print(euros + " euros son " + pesetas + " pesetas.");
  }
  
}
