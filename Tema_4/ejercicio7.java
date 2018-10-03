/*
 * Ejercicio 7 - Tema 4
 * Un programa que calcule la media de tres notas
 */


public class ejercicio7 {
	
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
	}
}

