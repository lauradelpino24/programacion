
import java.util.Scanner;

/*
 * Ejercicio 5 - Tema 3
 * Escribe un programa que calcule el área de un rectángulo.
 */

/**
 *
 * @author laura
 */
public class Ejercicio05 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la base del rectágulo: ");
    int base = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca la altura del rectángulo: ");
    int altura = Integer.parseInt(s.nextLine());
    
    System.out.println("El área del rectángulo es: " + (base * altura));
  }
  
}
