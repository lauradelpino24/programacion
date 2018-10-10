/*
 * Ejercicio 19 - Tema 5 
 * Un programa que pinte una pirámide por pantalla.
 */


public class ejercicio19 {
	
	public static void main (String[] args) {
		
    System.out.print("Introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el carácter con el que desea rellenar: ");
    String c = System.console().readLine();
    
      int planta = 1;
      int longitud = 1;
      int espacios = altura-1;
      
      while (planta <= altura) {
        
        for (int i = 1; i <= espacios; i++) {
          System.out.print(" ");
        }

        for (int i = 1; i <= longitud; i++) {
          System.out.print(c);
        }

        System.out.println();

        planta++;
        espacios--;
        longitud += 2;
    }
	}
}

