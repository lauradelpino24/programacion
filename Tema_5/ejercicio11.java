/*
 * Ejercicio 11 - Tema 5
 * Un programa que muestre tres columnas, el cuadrado y el cubo de los 5 
 * primeros números enteros a partir de uno que se introduce por teclado.
 */


public class ejercicio11 {
	
	public static void main (String[] args) {
		
    System.out.print ("Introduce un número entero: ");
    
    int introducido = Integer.parseInt(System.console().readLine());
     
     
     
    for ( int i = introducido; i < introducido + 5; i++){
      
      System.out.printf ("%4d %6d %8d\n", i, i * i, i * i * i);
      
      }
    
	}
}

