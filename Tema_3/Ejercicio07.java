
import java.util.Scanner;

/*
 * Ejercicio 7 - Tema 3
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 */

/**
 *
 * @author laura
 */
public class Ejercicio07 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca el precio del artículo sin IVA: ");
    double baseImponible = Double.parseDouble(s.nextLine());

    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
    System.out.printf("**************************\n");
    System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));
  }
  
}
