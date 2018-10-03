/*
 * Ejercicio 6 - Tema 4
 * Un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura.
 */


public class ejercicio6 {
	public static void main (String[] args) {
		
		System.out.println ("Por favor, la altura de la que cae el objeto: ");
		double altura = Integer.parseInt(System.console().readLine());
		
		double gravedad = 9.81;
		
		
		if (altura <= 0) {
			System.out.println ("No cae hulio");
		
		} else {
			
			double tiempo = Math.sqrt((2 * altura) / gravedad);
			System.out.println ("El tiempo que tarda es: " + tiempo);
		}
	}
}

