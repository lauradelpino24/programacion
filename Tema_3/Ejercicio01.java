
import java.util.Scanner;

/*
 * Ejercicio 1 - Tema 3
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 */

/**
 *
 * @author laura
 */
public class Ejercicio01 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    
    System.out.print("Introduzca el primer número: ");
    int num = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el segundo número: ");
    int num2 = Integer.parseInt(s.nextLine());
    
    int resultado = num * num2;
    
    System.out.println ("El resultado de la multiplicación es: "  + resultado);
  }
  
}
