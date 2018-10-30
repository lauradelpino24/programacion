/*
 * Ejercicio 2 - Tema 6
 * Realiza un programa que muestre al azar el nombre de una carta de la
 * baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
 * sería el 1).
 */
package programacion.Tema_6;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class ejercicio2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int carta = 0;

    int baraja = 0;

    String palo = " ";

    for(int i = 0; i<=1; i++){
      baraja = (int)(Math.random()*3) + 1;
      carta = (int)(Math.random()*13) + 1;
    }

    switch(baraja) {
      case 1:
      palo = "picas";
      break;
      case 2:
      palo = "corazones";
      break;
      case 3:
      palo = "diamantes";
      break;
      case 4:
      palo = "treboles";
      break;
      default:
    }  

    switch(carta) {
      case 1:
      System.out.println("La carta es A de "+palo);
      break;
      case 2:
      System.out.println("La carta es 2 de "+palo);
      break;
      case 3:
      System.out.println("La carta es 3 de "+palo); 
      break;
      case 4:
      System.out.println("La carta es 4 de "+palo);
      break;
      case 5:
      System.out.println("La carta es 5 de "+palo);
      break;
      case 6:
      System.out.println("La carta es 6 de "+palo);
      break;
      case 7:
      System.out.println("La carta es 7 de "+palo);
      break;
      case 8:
      System.out.println("La carta es 8 de "+palo);
      break;
      case 9:
      System.out.println("La carta es 9 de "+palo);
      break;
      case 10:
      System.out.println("La carta es 10 de "+palo);
      break;
      case 11:
      System.out.println("La carta es J de "+palo);
      break;
      case 12:
      System.out.println("La carta es Q de "+palo);
      break;
      case 13:
      System.out.println("La carta es K de "+palo);
      break;
      default:
    }
    
 }
}
