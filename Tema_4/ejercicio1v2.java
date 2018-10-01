/*
 * ejercicio1v2.java
 *Ejercicio 1 v.2 - Tema 4
* Un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora de ese día.
 */


public class ejercicio1v2 {
	
	public static void main (String[] args) {
		System.out.print ("Por favor, introduzca un día de la semana: ");
		String dia = (System.console().readLine());
		
		if (dia.equals("lunes")) {
			System.out.println("EED");
		} else if (dia.equals("martes")) {
			System.out.println ("SINF");
			
		} else if (dia.equals("miércoles")) {
			System.out.println ("PRO");
			
		} else if (dia.equals("jueves")) {
			System.out.println ("PRO");
		
		} else if (dia.equals("viernes")) {
			System.out.println ("SINF");
		
		} else {
			System.out.println ("Por favor, introduzca un día de la semana: ");
		
		}
	}
}
