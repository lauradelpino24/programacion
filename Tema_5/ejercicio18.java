/*
 * Ejercicio 18 - Tema 5
 * Un programa que obtenga los números enteros comprendidos entre dos números
 * introducidos por teclado y validados como distintos, el programa empieza por
 * el menor de los introducidos e ir incrementando de 7 en 7.
 */


public class ejercicio18 {
	
	public static void main (String[] args) {
		
    
    System.out.print("Introduzca un número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca otro número distinto: ");
    int num2 = Integer.parseInt(System.console().readLine());
    
    if( num1 == num2) {
      
      System.out.print("Introduzca dos números diferentes. ");
      
      } else {
        
        int menor = 0;
        int mayor = 0;
          
          if(num1 < num2){
            
            mayor = num2;
            menor = num1;
            
            } else {
              
            mayor = num1;
            menor = num2;
              
            }
            
          
        for (int i = menor; i < mayor; i++) {
          
          if (i != menor){
            
            System.out.print(i + " " );
 
          }
          
          i += 6;
        }

      }
    
	}
}

