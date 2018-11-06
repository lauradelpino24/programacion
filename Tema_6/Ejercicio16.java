/*
 * Ejercicio 16 - Tema 6
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
 * ha perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 * ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String figura1 = "";
    String figura2 = "";
    String figura3 = "";
    String figura = "";
    int figuraTirada = 0;
    
    for (int i = 0; i < 3 ; i++){
    
      figuraTirada = (int) (Math.random()* 5) + 1;
      
      switch(figuraTirada) {
        case 1:
          figura = "corazón";
          break;
        case 2:
          figura = "diamante";
          break;
        case 3:
          figura = "herradura";
          break;
        case 4:
          figura = "campana";
          break;
        case 5:
          figura = "limón";
          break;
      }
      
      switch(i) {
        case 0:
          figura1 = figura;
          break;
        case 1:
          figura2 = figura;
        break;
        case 2:
          figura3 = figura;
        break;
        default:
      }
    }
    System.out.print (figura1 + " " + figura2 + " " + figura3);
    
    if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
      System.out.println("\nLo siento, ha perdido.");
    } else if ((figura1 == figura2) && (figura2 == figura3)) {
      System.out.println("\nEnhorabuena, ha ganado 10 monedas.");
    } else {
      System.out.println("\nBien, ha recuperado su moneda.");
    
    }
  }
}
