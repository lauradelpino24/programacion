/*
 * Ejercicio 7 - Tema 6
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String valor1 = " ";

    String valor2 = " ";

    String valor3 = " ";

    System.out.println("/ / / / / / / / / / / / / / / / / / / /");

    System.out.println("Quiniela 1   1 x 2");
    System.out.println("- - - - - - - - - ");
  
    for (int i = 1; i<=15; i++){

      int numero = (int)(Math.random()*3);

      if (numero == 0){
        valor1 = "x";
      }else if (numero == 1){
        valor2 = "x";
      }else if (numero == 2){
        valor3 = "x";
      }

      System.out.printf("Partido %2d: ",i); 
      System.out.println(" "+valor1+" "+valor2+" "+valor3);

      //Variables de 0
      valor1 = " ";
      valor2 = " ";
      valor3 = " ";
    }

    System.out.println("/ / / / / / / / / / / / / / / / / / / /");

    System.out.println("Quiniela 2   1 x 2");
    System.out.println("- - - - - - - - - ");
  
    for (int i = 1; i<=15; i++){

      int numero = (int)(Math.random()*3);

      if (numero == 0){
        valor1 = "x";
      }else if (numero == 1){
        valor2 = "x";
      }else if (numero == 2){
        valor3 = "x";
      }

      System.out.printf("Partido %2d: ",i); 
      System.out.println(" "+valor1+" "+valor2+" "+valor3);

      valor1 = " ";
      valor2 = " ";
      valor3 = " ";
    } 

    System.out.println("/ / / / / / / / / / / / / / / / / / / /");

    System.out.println("Quiniela 3   1 x 2");
    System.out.println("- - - - - - - - -");
  
    for (int i = 1; i<=15; i++){

      int numero = (int)(Math.random()*3);

      if (numero == 0){
        valor1 = "x";
      }else if (numero == 1){
        valor2 = "x";
      }else if (numero == 2){
        valor3 = "x";
      }

      System.out.printf("Partido %2d: ",i); 
      System.out.println(" "+valor1+" "+valor2+" "+valor3);

      valor1 = " ";
      valor2 = " ";
      valor3 = " ";
    } 
  }
}
