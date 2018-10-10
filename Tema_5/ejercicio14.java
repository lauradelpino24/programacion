/*
 * Ejercicio 14 - Tema 5
 * Un programa que pida una base y un exponente y calcule la potencia.
 */


public class ejercicio14 {
	
	public static void main (String[] args) {
		
    System.out.println("Cálculo de una potencia");
    
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());

    double potencia = 1;
        
    if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      
      potencia = 1/potencia;
    }

System.out.println(base + "^" + exponente + " = " + potencia);
    
	}
}

