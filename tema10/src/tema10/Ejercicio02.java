/*
 * 2. Realiza un programa que introduzca valores aleatorios (entre 0 y
 *    100) en un ArrayList y que luego calcule la suma, la media, el
 *    máximo y el mínimo de esos números. El tamaño de la lista también
 *    será aleatorio y podrá oscilar entre 10 y 20 elementos ambos
 *    inclusive
 */
package tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio02 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    ArrayList<Integer> n = new ArrayList<>();
    
    // Genera ArrayList
    
    for (int i = 0; i < aleatorio(10,20); i++){
       n.add(aleatorio(0,100));
       
    }
    
    // Calcula la suma, el mínimo y el máximo
    int min = n.get(0);
    int max = n.get(0);
    int suma = 0;
    for (Integer numero : n){
      suma += numero;
      if (numero > max){
        max = numero;
      }
      // max = numero > max ? numero : max; (Esto es lo mismo que el if)
      if (numero < min){
        min = numero;
      }
     // min = numero < min ? numero : min; (Esto es lo mismo que el if)
    }
    
    System.out.println(n);
    System.out.println("Máximo: " + max);
    System.out.println("Mínimo: " + min);
    System.out.println("Suma: " + suma);
  }
  public static int aleatorio(int min, int max){
    return (int)(Math.random()* (max - min -1)) + min;
  }
}