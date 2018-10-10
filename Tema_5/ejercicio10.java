/*
 * Ejercicio 10 - Tema 5
 * Un programa que calcule la media de números introducidos por teclado.
 */


public class ejercicio10 {
	
	public static void main (String[] args) {
		
    System.out.println("El programa calcula la media de los números introducidos.");
    
    double num = 0;
    double introducido = 0;
    double suma = 0;
    
    while ( introducido >= 0) {
      
      System.out.print("Introduzca un número, para parar, introduzca un número negativo: ");
      introducido = Double.parseDouble(System.console().readLine());
      num++;
      
      suma += introducido; 
      
      }
      
      suma -= introducido;
      
    System.out.println("La media de los números introducidos es: " + (suma / (num - 1)));
	}
}

