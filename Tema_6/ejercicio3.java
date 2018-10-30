/*
 * Ejercicio 3 - Tema 6
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 */
package tema_6;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class ejercicio3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String palo = "";
    String carta;
        
    int tipopalo = (int)(Math.random()*4)+1;
        
    switch(tipopalo) {
      case 1:
      palo = "Bastos";
      break;
      
      case 2:
      palo = "Copas";
      break;
            
      case 3:
      palo = "Espadas";
      break;
        
      case 4:
      palo = "Oro";
      break;
      default:
      }
        
      int n = (int)(Math.random()*13)+1;
        
      switch(n) {
      case 11:
      carta = "Sota";
      break;
            
      case 12:
      carta = "Caballo";
      break;
            
      case 13:
      carta = "Rey";
      break;
            
      case 1:
      carta = "AS";
      break;
            
      default:
      carta = String.valueOf(n);
      }
        
        System.out.println(carta+" de "+palo);
 }
}
