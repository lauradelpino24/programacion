/*
 * Ejercicio 17 - Tema 4 
 * Dado un número entero, nos diga cuál es la última cifra.
 */


public class ejercicio17 {
	
	public static void main (String[] args) {
    
    System.out.print ("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int ultimo = numero % 10;
    
    System.out.print ("La última cifra es: " + ultimo);
		
	}
}

