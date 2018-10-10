/*
 * Ejercicio 9 - Tema 5
 * Un programa que nos diga cuántos dígitos tiene un número introducido por
 * teclado.
 */


public class ejercicio9 {
	
	public static void main (String[] args) {
		
    int digitos = 1;
    
    System.out.print("Introduzca un número: ");
    int introducido = Integer.parseInt(System.console().readLine());
    
    while ( introducido > 10 ) {
      
      introducido /= 10;
      digitos++;
      
      }
    System.out.println ( "Tiene " + digitos + " digitos.");
	}
}

