/*
 * Ejercicio 2 - Tema 4
 * Un programa que pida una hora y muestre buenos días, buenas tardes o buenas noches según la hora.
 */


public class ejercicio2 {
	
	public static void main (String[] args) {
		
		System.out.print ("Por favor, introduzca una hora: ");
		String hora = (System.console().readLine());
		int n = Integer.parseInt ( hora );
		
			if ((n >= 6) && (n <= 12)){
				System.out.println ("Buenos días");
			} else if (( n >=13) && ( n <=20)){
				System.out.println ("Buenas tardes");
			} else if (( n >=21) && ( n <=23)){ 
				System.out.println ("Buenas noches");
			} else if (( n >=0) && ( n <=5)){
				System.out.println ("Buenas noches");
			} else {
				System.out.print ("Por favor, introduzca una hora: ");
			}
	}
}

