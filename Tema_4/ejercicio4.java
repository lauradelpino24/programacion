/*
 *Ejercicio 4 - Tema 4
* Un programa que pida por teclado un número del 1 al 7 y te muestre el día de la semana. 
 */


public class ejercicio4 {
	
	public static void main (String[] args) {
		
		System.out.print ("Por favor, introduzca el número de horas trabajadas en la semana: ");
		String n = (System.console().readLine());
		int horas = Integer.parseInt ( n );
		
		if (( horas <= 40 ) && ( horas >= 0 )) {
			int salario = horas * 12;
			System.out.println (" Su salario es: " + salario);
		} else if ( horas >= 41 ) {
			int extras = horas - 40;
			int salario2 = (horas * 12) + (extras * 16);
			System.out.println (" Su salarui es: " + salario2);
		}
	}
}

