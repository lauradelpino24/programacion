/*
 * Ejercicio 16 - Tema 5
 */


public class ejercicio16 {
	
	public static void main (String[] args) {
		
    System.out.print("Introduzca un número entero: ");
    int num = Integer.parseInt(System.console().readLine());

    boolean primo = true;
    
    for (int i = 2; i < num; i++) {
      if ((num % i) == 0) {
        primo = false;
      }
    }
        
    if (primo) {
      System.out.println("El número es primo.");
    } else {
      System.out.println("El número no es primo.");
}
    
	}
}

