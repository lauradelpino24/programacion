/*
 * Ejercicio 5 - Tema 4
 * Un programa que resuelva una ecuación de 1º grado.
 */


public class ejercicio5 {
	
	public static void main (String[] args) {
		
		System.out.println ("Por favor introduzca el valor de a: ");
		double numA = Integer.parseInt(System.console().readLine());
		
		System.out.println ("Por favor introduzca el valor de b: ");
		double numB = Integer.parseInt(System.console().readLine());
		
		
		
		
		if ( numA != 0) {
			double x = - numB / numA;
			
			System.out.println ("Solucion de la ecuación: " + x);
		
		} else if (numB != 0) {
			System.out.println ("Solución imporsible!");
		
		} else {
			System.out.println ("No sé!");
		}
	} 
}
