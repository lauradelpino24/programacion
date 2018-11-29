/*
 * Ejercicios del 20 al 28 - Tema 8
 */
package tema8;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class SegundaTanda {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  }
  
  /**
  * Genera un array de tamaño n con números aleatorios
  * cuyo intervalo (mínimo y máximo) se indica como parámetro.
  * @param n
  * @param min
  * @param max
  * @return 
  */
  public static int[] generaArayInt(int n, int min, int max){
    
    int[] array1 = new int[n];
    
    for (int i = 0; i < n; i++){
    
      array1[i] = PrimeraTandav2.aleatorio(min, max);
    }return array1;
    
  }
  
  /**
  * Devuelve el mínimo del array que se pasa como
  * parámetro.
  * @param arrayA
  * @return 
  */
  public static int minimoArrayInt(int[] arrayA){
    
      int min = arrayA[0];
      
      for (int i = 0; i < arrayA.length; i++){
      
        if (min > arrayA[i]){
        
          min = arrayA[i];
        
        }
        
      }return min; 
      
      
  }
  
  /**
  * Devuelve el máximo del array que se pasa como
  * parámetro.
  * @param arrayA
  * @return 
  */
  public static int maximoArrayInt(int[] arrayA){
    
      int max = arrayA[0];
      
      for (int i = 0; i < arrayA.length; i++){
      
        if (max < arrayA[i]){
        
          max = arrayA[i];
        
        }
        
      }return max; 
  }
  
  /**
  * Devuelve la media del array que se pasa como parámetro.
  * @param arrayA
  * @return 
  */
  public static double mediaArrayInt(int[] arrayA){
    
      double media = arrayA[0];
      
      for (int i = 0; i < arrayA.length; i++){
        
        media += arrayA[i];
        
      }
      media = media/arrayA.length;
      return media; 
  }
  
  /**
  * Dice si un número está o no dentro de un array.
  * @param arrayA
  * @return 
  */
  public static boolean estaEnArrayInt(int[] arrayA, int num){
    
      for(int i = 0; i < arrayA.length; i ++){
      
        if(arrayA[i] == num){
        
           return true; 
        
        }
      }
      return false; 
  }
  
  /**
  * Busca un número en un array y devuelve la posición
  * (el índice) en la que se encuentra.
  * @param arrayA
  * @return 
  */
  public static boolean posicionEnArrayInt(int[] arrayA, int num){
    
      return 0; 
  }
}
