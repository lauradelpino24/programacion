/*
 * Ejercicio 18 - Tema 4
 * Dado un número entero, nos diga cuál es la primera cifra.
 * Se permiten números de hasta 5 cifras.
 */


public class ejercicio18 {
	
	public static void main (String[] args) {
		
    System.out.print ("Introduzca un número entero (5 cifras máx): ");
    
    int primer = 0;
    
    int num = Integer.parseInt(System.console().readLine());
    
    if (num >= 100000) {
        
        System.out.println("El número puede tener 5 cifras como máximo. ");
        
    } else {
    
      if (num < 10) {
      
        primer = num;
      
        }
      
      if (( num >= 10) && (num < 100)) {
          
          primer = num / 10;
        }
          
      if ((num >= 100) && (num < 10000)) {
          
          primer = num / 100;
          
        }
        
      if ((num >= 1000) && (num < 10000)) {
          
          primer = num / 1000;
          
        }
      
      if (num >= 10000) {
          
          primer = num / 10000;
          
        } 
        
          System.out.println("La primera cifra es: " + primer);
          
          }
    }
	}

