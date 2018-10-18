/*
 * Ejercicio 35 - Tema 5
 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
 * pedir la altura. Se debe comprobar que la altura sea un número impar mayor
 * o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 */
package programacion.Tema_5;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class ejercicio35 {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la X: ");
    int altura = Integer.parseInt(s.nextLine());
    
    int patas = altura / 2;
    String espaciosInternos = "";
    String espacios = "";
    
    for (int i = 1; i < (altura - 1); i++) { // Configurar espacios internos
      
      espaciosInternos += " ";
    }
    
      for (int i = 0; i < patas; i++) { // Mitad superior de la X
        
        System.out.print(espacios);
        System.out.print("*");
        System.out.print(espaciosInternos);
        System.out.print("*\n");
        
        espaciosInternos = espaciosInternos.substring(i, (patas - 1));
        espacios += " ";
      }
      
    System.out.println(espacios + "*"); // Asterisco central
    
    for (int i = 0; i < patas; i++) { // Mitad inferior de la X
      
      espacios = espacios.substring(i, (patas - 1));
      espaciosInternos += " ";
      
      System.out.print(espacios);
      System.out.print("*");
      System.out.print("*\n");
    }
    
  System.out.println();
 }
}