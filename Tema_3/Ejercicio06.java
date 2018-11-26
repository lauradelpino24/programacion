
import java.util.Scanner;

/*
 * Ejercicio 6 - Tema 3
 * Escribe un programa que calcule el área de un triángulo.
 */

/**
 *
 * @author laura
 */
public class Ejercicio06 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la base del triángulo: ");
    int base = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca la altura del triángulo: ");
    int altura = Integer.parseInt(s.nextLine());
    
    int area = (base * altura) / 2;
    
    System.out.println("El área del rectángulo es: " + area);
  }
  
}
