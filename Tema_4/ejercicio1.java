/*
*Ejercicio 1 - Tema 4
* Un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora de ese día.
 */


public class ejercicio1 {
	
	public static void main (String[] args) {
		
		System.out.print("Por favor, introduzca un día de la semana: ");
		String dia = (System.console().readLine());
		
		String nombreDelDia;
		
		switch (dia) {
			case "lunes":
				nombreDelDia = "EED";
				break;
			case "martes":
				nombreDelDia = "SINF";
				break;
			case "miercoles":
				nombreDelDia = "PRO";
				break;
			case "jueves":
				nombreDelDia = "PRO";
				break;
			case "viernes":
				nombreDelDia = "SINF";
				break;
			default:
				nombreDelDia = "no existe ese día";
			}
			
		System.out.println ("Día " + dia + " : " + nombreDelDia);
				
	}
}

