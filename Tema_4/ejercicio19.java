/*
 * Ejercicio 19 - Tema 4
 * Un programa que nos diga cuántos dígitos tiene un número entero que puede
 * ser negativo o positivo. 
 * 5 dígitos como máximo.
 */


public class ejercicio19 {
	
	public static void main (String[] args) {
		
  System.out.print ("Introduzca un número entero (5 cifras máx): ");
  
  int num = Math.abs(Integer.parseInt(System.console().readLine()));
  
  int cifras = 0;
  
  if (num >= 100000) {
        
        System.out.println("El número puede tener 5 cifras como máximo. ");
        
    } else {
    
      if (num < 10 ){
      
        cifras = 1;
      
        }
      
      if (( num >= 10) && (num < 100)) {
          
          cifras = 2;
        }
          
      if ((num >= 100) && (num < 10000)) {
          
          cifras = 3;
          
        }
        
      if ((num >= 1000) && (num < 10000)) {
          
          cifras = 4;
          
        }
      
      if (num >= 10000) {
          
          cifras = 5;
          
        }
        
    System.out.print ("Tiene " + cifras + " digitos");
    
          }
    }
	}
