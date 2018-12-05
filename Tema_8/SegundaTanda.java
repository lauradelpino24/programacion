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
    
    int[] arrayA = generaArayInt(7, 2, 8);
    int[] arrayB = rotaIzquierdaArrayInt(arrayA, 2);
    
    for(int i = 0; i < arrayA.length; i++){
      System.out.print(arrayA[i] + " ");
    }
    System.out.println("");
    for(int i = 0; i < arrayB.length; i++){
      System.out.print(arrayB[i] + " ");
    }
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
  * @param num
  * @return 
  */
  public static int posicionEnArrayInt(int[] arrayA, int num){
    
    for(int i = 0; i < arrayA.length; i++){
      if(arrayA[i] == num){
        return i;
      }
    }
    return -1;
  }
  
  /**
   * Le da la vuelta a un array.
   * @param arrayA
   * @return
   */
  public static int[] volteaArrayInt(int[] arrayA){
    int[] arrayB = new int[arrayA.length];
    
    for(int i = 0; i < arrayA.length; i++){
      arrayB[i] = arrayA[arrayA.length - (i + 1)];
    }
    return arrayB;
  }
  
  /**
   * Rota n posiciones a la derecha los números de
   * un array.
   * @param arrayA
   * @return 
   */
  public static int[] rotaDerechaArrayInt(int[] arrayA, int n){
    int[] arrayB = new int[arrayA.length];
    int[] arrayC = arrayA;
    
    for(int j = 0; j < n; j++){
      for(int i = arrayA.length - 1; i >= 1; i--){
        arrayB[i] = arrayC[i - 1];
      }
      arrayB[0] = arrayC[arrayC.length - 1];
      arrayC = arrayB;
    }
    return arrayB;
  }
  
  /**
   * Rota n posiciones a la izquierda los números de
   * un array.
   * @param Array arrayA
   * @param int n
   * @return
   */
  public static int[] rotaIzquierdaArrayInt(int[] arrayA, int n){
    int[] arrayB = new int[arrayA.length];
    int[] arrayC = arrayA;
    
   for(int j = 0; j < n; j++){
     arrayB = new int[arrayA.length];
      for(int i = 0; i < arrayA.length - 1; i++){
        arrayB[i] = arrayC[i + 1];
      }
      arrayB[arrayB.length - 1] = arrayC[0];
      arrayC = arrayB;
    }
    return arrayB;
  }
}
