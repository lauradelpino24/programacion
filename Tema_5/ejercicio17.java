/*
 * Ejercicio 17 - Tema 5
 * Un programa que sume los 100 números siguientes a un número entero y positivo
 * introducido por teclado. Debe comprobar que sea un número positivo.
 */


public class ejercicio17 {
	
	public static void main (String[] args) {
		
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    
    if( num <= 0 ) {
      
      System.out.print("Introduzca un número positivo. ");
      
      } else {
          
          int suma = 0;
          
        for(int i = num; i <= (num +100); i++){
          
          suma += i;

          }
      
        System.out.print(suma);
      
        }
    
	}
}

