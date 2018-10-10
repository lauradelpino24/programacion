/*
 * Ejercicio 13 - Tema 5
 * 
 */


public class ejercicio13 {
	
	public static void main (String[] args) {
		
    System.out.println("Por favor, introduzca 10 números enteros: ");

    int negativo = 0;
    int positivo = 0;
    
    for (int i = 0; i < 10; i++) {
      if (Integer.parseInt(System.console().readLine()) < 0) {
        negativo++;
      } else {
        positivo++;
      }
    }
    
System.out.println("Ha introducido " + positivo + " positivos y " + negativo + " negativos");
    
	}
}

