/*
 * Ejercicio 15 - Tema 4
 * Un programa que dibuje una pirámide con un carácter introducido
 * por teclado y que mediante un menú permita elegir hacia donde apunta
 * el vértice de la pirámide.
 */


public class ejercicio15 {
	
	public static void main (String[] args) {
		System.out.println ("¿Hacia dónde quieres que apunte el vértice?: ");
    System.out.println ("1. Arriba ");
    System.out.println ("2. Abajo ");
    System.out.println ("3. Izquierda ");
    System.out.println ("4. Derecha ");
    
    int elegido = Integer.parseInt(System.console().readLine());
    
    System.out.print ("Introduzca un carácter: ");
    String c = (System.console().readLine());
    
    if (c.length() >1) {
      
      System.out.println ("Introduzca UN solo carácter. ");
      
      } else {
        
        if (elegido == 1) {
          
          System.out.println (" " + " " + " " + c);
          System.out.println (" " + " " + c + c + c);
          System.out.println (" " + c + c + c + c + c);
          System.out.println (c + c + c + c + c + c + c + c);
        
        } else if (elegido == 2) {
          
          System.out.println (c + c + c + c + c + c + c + c);
          System.out.println (" " + c + c + c + c + c);
          System.out.println (" " + " " + c + c + c);
          System.out.println (" " + " " + " " + c);
          
        } else if (elegido == 3){
          
          System.out.println (" " + " " + " " + " " + " " + " " + " " + c);
          System.out.println (" " + " " + " " + " " + " " + " " + c + c);
          System.out.println (" " + " " + " " + " " + " " + c + c + c);
          System.out.println (" " + " " + " " + " " + c + c + c + c);
          System.out.println (" " + " " + " " + c + c + c + c + c);
          System.out.println (" " + " " + " " + " " + c + c + c + c);
          System.out.println (" " + " " + " " + " " + " " + c + c + c);
          System.out.println (" " + " " + " " + " " + " " + " " + c + c);
          System.out.println (" " + " " + " " + " " + " " + " " + " " + c);
          
        } else if ( elegido == 4){
          System.out.println (c + " " + " " + " " + " " + " " + " " + " ");
          System.out.println (c + c + " " + " " + " " + " " + " " + " ");
          System.out.println (c + c + c + " " + " " + " " + " " + " ");
          System.out.println (c + c + c + c + " " + " " + " " + " ");
          System.out.println (c + c + c + c + c + " " + " " + " ");
          System.out.println (c + c + c + c + " " + " " + " " + " ");
          System.out.println (c + c + c + " " + " " + " " + " " + " ");
          System.out.println (c + c + " " + " " + " " + " " + " " + " ");
          System.out.println (c + " " + " " + " " + " " + " " + " " + " ");
          }
        
      }
	}
}

