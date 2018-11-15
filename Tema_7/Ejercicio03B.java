/*
 * Ejercicio 3B - Tema 7
 * Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio03B {
  public static void main(String[] args) throws InterruptedException {
    Scanner s = new Scanner(System.in);
    int num[][] = new int[5][6];
    
    System.out.println("Se van a generar 20 números aleatorios:\n");
    
    for (int fila = 0; fila < 4; fila++) {
      
      for (int columna = 0; columna < 5; columna++) {
        
        int numero = (int)(Math.random() * 899) + 100;
        
        num[fila][columna] = numero;
      }
    }
    
    for (int fila = 0; fila < 4; fila++) { // Suma filas
      
      int sumFila = 0;
      
      for (int columna = 0; columna < 6; columna++) {
        
        sumFila += num[fila][columna];
      }
      
      num[fila][5] = sumFila;
    }
    
    for (int columna = 0; columna < 5; columna++) { // Suma columnas
      
      int sumColumna = 0;
      
      for (int fila = 0; fila < 4; fila++) {
        
        sumColumna += num[fila][columna];
      }
      
      num[4][columna] = sumColumna;
    }
    
    int total = 0;
    
    for (int fila = 0; fila < 4; fila++) { // total
      
      total += num[fila][5];
    }
    
    num[4][5] = total;
    
    System.out.println("----------------------------------------------");
    
    for (int fila = 0; fila < 5; fila++) { // Pintar array
      
      for (int columna = 0; columna < 6; columna++) { // Pintar en cada casilla
        
        if (columna == 4) { // Barra en la suma de la fila
        
          System.out.printf("%-4d %-4s", num[fila][columna], "|");
          
        } else if (columna == 5) { // Pinta Sumatorio de la fila o el total
          
          if (fila < 4) { // Suma fila sin la última
          
            System.out.printf("%-5d %-9s", num[fila][columna], "SumFila " + fila);
          
          } else { // Suma fila
            
            System.out.printf("%-5d %-8s", num[fila][columna], "TOTAL\n");
          }
          
        } else { // Pinta las casillas del array
          
          System.out.printf("%-8d", num[fila][columna]);
        }
      }
      
      if (fila == 3) { // Pinta la barra divisora de abajo
        
        System.out.print("\n----------------------------------------------");
      }

      System.out.println();
    }
    
  }
}
