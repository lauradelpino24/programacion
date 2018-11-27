/*
 * Función tiraDado
 */
package tema8;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class PruebaFunciones {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Juego de la Oca versión ies campanillas.");
    
    System.out.println(tiraDado());
    System.out.println(tiraDado());
    
    System.out.println("Aleatorio entre dos números.");
    System.out.println("Introduzca el mínimo: ");
    int minimo = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca el máximo: ");
    int maximo = Integer.parseInt(s.nextLine());
    
    for (int i = 0; i < 20; i++){
    
      System.out.print(aleatorio(minimo, maximo) + " ");
    }
    
    System.out.println("");
    System.out.println("Introduzca un número: ");
    int num = Integer.parseInt(s.nextLine());
    System.out.println("Si invertimos " + num + " se nos quedaría: " + invierte(num));
    
  }
  
  // Funciones //
  
  /**
   * Devuelve un número entero aleatorio entre 1 y 6 que se corresponde con
   * la tirada de un dado.
   * 
   * @return Un número aleatorio entre 1 y 6.
   */
  public static int tiraDado(){
  
  return (int)(Math.random() * 6) + 1;
  }
  
  /**
   * Pide un número máximo y mínimo, y nos devuelve números aleatorios entre
   * esos dos números.
   * @param min
   * @param max
   * @return 
   */
  
  public static int aleatorio(int min, int max){
    
    int n = (int)(Math.random() * (max - min + 1)) + min;
    return n;
  }
  
  /**
   * Invierte un número. 
   * Por ejemplo: 1234 y devuelve 4321.
   * @param n
   * @return 
   */
  
  public static int invierte(int n){
  
    int volteado = 0;
    
    while (n > 0) {
      volteado = (volteado * 10) + (n % 10);
      n /= 10;
    }
    return volteado; 
  }
}