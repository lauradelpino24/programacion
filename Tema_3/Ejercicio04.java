
import java.util.Scanner;

/*
 * Ejercicio 4 - Tema 3
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 */

/**
 *
 * @author laura
 */
public class Ejercicio04 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el primer número: ");
    int num = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el segundo número: ");
    int num2 = Integer.parseInt(s.nextLine());
    
    int suma = num + num2;
    int resta = num - num2;
    int multiplicacion = num * num2;
    double division = (double)(num / num2);
    
    System.out.println("Suma: " + suma);
    System.out.println("Resta: " + resta);
    System.out.println("Multiplicación: " + multiplicacion);
    System.out.println("División: " + division);
  }
  
}
