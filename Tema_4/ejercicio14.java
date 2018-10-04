/*
 * Ejercicio 14 - Tema 4
 * Un programa que dado un numero, nos diga si es par y/o divisible
 * entre 5
 */


public class ejercicio14 {
	
	public static void main (String[] args) {
    
    System.out.print ("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int numPar = num % 2;
    int div5 = num % 5;
    
    if (numPar == 0) {
      
      System.out.println (num + " es par");
      
    } else {
      
      System.out.println (num + " no es par");
    }
    
    if (div5 == 0) {
      
      System.out.println (" y divisible entre 5.");
      
    } else{
      
      System.out.println ("no es divisible entre 5");
      
    }
    
	}
}

