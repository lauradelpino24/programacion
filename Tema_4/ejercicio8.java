/*
 * Ejercicio 8 - Tema 4
 * Un programa que calcule la media de tres notas
 */


public class ejercicio8 {
	
	public static void main (String[] args) {
		System.out.println ("Por favor, introduzca la primera nota: ");
		double nota1 = Integer.parseInt(System.console().readLine());
		
		System.out.println ("Por favor introduzca la segunda nota: ");
		double nota2 = Integer.parseInt(System.console().readLine());
		
		System.out.println ("Por favor introduzca la tercera nota: ");
		double nota3 = Integer.parseInt(System.console().readLine());
		
		double resultado = ((nota1 + nota2 + nota3) / 3);
		
		if ((nota1 < 0 || nota2 < 0 || nota3 < 0) || (nota1 > 10 || nota2 > 10 || nota3 > 10)){
			System.out.println ("No se puede realizar la media");
		} else {
			System.out.println ("La media es: " + resultado);
		}
		if (resultado < 5) {
			System.out.println ("Insuficiente");
		
		} else if ((resultado == 5) && (resultado < 6)) {
			System.out.println ("Suficiente");
		
		} else if ((resultado == 6) && (resultado < 7)) {
			System.out.println ("Bien");
		
		} else if ((resultado >= 7) && (resultado <9)) {
			System.out.println ("Notable");
		
		} else if (resultado >=9) {
			System.out.println ("Sobresaliente");
		
		} else {
			System.out.println ("No se puede realizar la media");
		}
		
	}
}



