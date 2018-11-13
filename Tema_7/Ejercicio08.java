 /*
 * Ejercicio 8 - Tema 7
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String[] mes = {
      
      "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", 
      "octubre", "noviembre", "diciembre"
    };
    
    int[] temperatura = new int[12];
    
    for(int i = 0; i < 12; i++){
    System.out.print("Introduzca la temperatura media de " + mes[i] + ": ");
    temperatura[i] = Integer.parseInt(s.nextLine());
    }
     for (int i = 0; i < 12; i++) {
      System.out.printf("%12s " + "│", mes[i]);
      for (int j = 0; j < temperatura[i]; j++) {
        System.out.print("▄");
      }
      System.out.println(" " + temperatura[i] + "ºC");
    }
  }
}
