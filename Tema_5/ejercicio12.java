/*
 * Ejercicio 12 - Tema 5
 * Un programa que muestre los n primeros términos de la serie de Fibonacci.
 */


public class ejercicio12 {
	
	public static void main (String[] args) {
		
    System.out.print ("Introduce un número entero: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int primero = 0;
    int segundo = 1;
    int tercero = 0;
    
    for (int i = 1; i <= num; i++){
      
      System.out.print (primero + " ");
      
      if (i <= 2){
        
        primero = segundo;
        
        } else {
          
          tercero = primero + segundo;
          segundo = primero;
          primero = tercero;
          
          }
      
      }
    
	}
}

