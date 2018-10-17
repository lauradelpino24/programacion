
import java.util.Scanner;

/*
 * Ejercicio 19 - Tema 5 
 * Un programa que pinte una pirámide por pantalla.
 */


public class ejercicio19 {
	
    public static void main (String[] args) {
      
    Scanner s = new Scanner(System.in);	
    
    System.out.print("Introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca el carácter con el que desea rellenar: ");
    String c = s.nextLine();
    
      int piso = 1;
      int longitud = 1;
      int espacios = altura-1;
      
      while (piso <= altura) {
        
        for (int i = 1; i <= espacios; i++) {
          System.out.print(" ");
        }

        for (int i = 1; i <= longitud; i++) {
          System.out.print(c);
        }

        System.out.println();

        piso++;
        espacios--;
        longitud += 2;
    }
	}
}

