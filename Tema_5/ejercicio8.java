/*
 * Ejercicio 8 - Tema 5
 * Dado un número mostrar su tabla de multiplicar.
 */


public class ejercicio8 {
	
	public static void main (String[] args) {
		
    System.out.print("Introduzca un número para mostrar su tabla de multiplicar: ");
    int num = Integer.parseInt(System.console().readLine());
        
    for (int i = 0; i <= 10; i++) {
      System.out.println(num + " x " + i + " = " + num * i);
    }
	}
}

