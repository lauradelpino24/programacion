/*
 * Ejercicio 9 - Tema 7
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] num = new int[8];

    for (int i = 0; i < 8; i++) {

      System.out.println("Introduzca numeros (separando cada uno por intro):");
      num[i] = Integer.parseInt(s.nextLine());
		
    }

    for (int i = 0; i < 8; i++){
      
      if(num[i]%2 == 0){
      
        System.out.println(num[i]+" /Par");
      
      }else{
      
        System.out.println(num[i]+" /Impar");
      
      }
    }
  }
}
