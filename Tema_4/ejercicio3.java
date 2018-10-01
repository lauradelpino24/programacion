/*
*Ejercicio 3 - Tema 4
* Un programa que pida por teclado un número del 1 al 7 y te muestre el día de la semana.
 */


public class ejercicio3 {
	
	public static void main (String[] args) {
		System.out.print ("Por favor, introduzca un número del 1 al 7: ");
		String n = (System.console().readLine());
		int dia = Integer.parseInt ( n );
		
		if ( dia == 1 ) {
			System.out.println("lunes");
		} else if ( dia == 2 ) {
			System.out.println ("martes");
			
		} else if ( dia == 3 ) {
			System.out.println ("miércoles");
			
		} else if ( dia == 4 )  {
			System.out.println ("jueves");
		
		} else if ( dia == 5 ) {
			System.out.println ("viernes");
			
		} else if ( dia == 6 ) {
			System.out.println ("sábado");
			
		} else if ( dia == 7 ) {
			System.out.println ("domingo");
		
		} else {
			System.out.println ("Por favor, introduzca un número del 1 al 7: ");
		
		}
	}
}

