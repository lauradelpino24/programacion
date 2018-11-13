/*
 * Ejercicio 10 - Tema 7
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
 * es necesario.
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] num = new int[20];
    int[] pares = new int[20];
    int[] impares = new int[20];

    for (int i = 0; i < 20; i++) {
      num[i]=(int)(Math.random()*101);
    }

    int contadorPar = 0;
    int contadorImPar = 0;

    for(int i= 0; i < 20; i++){
      
      if (num[i]%2 == 0){
      
        pares[contadorPar] = num[i];
        contadorPar++;

      }else if (num[i]%2 != 0){
      
        impares[contadorImPar] = num[i];
        contadorImPar++;

      }
    }

    for (int i = 0; i < contadorPar;i++) {
      num[i] = pares[i];
    }

    for (int i = 0; i < contadorImPar;i++) {
      num[contadorPar + i] = impares[i];
    }

    for (int i = 0; i < 20;i++) {
      System.out.printf("%8d |",num[i]);
      System.out.println("");  
    }
  }
}
