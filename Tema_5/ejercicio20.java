/*
 * Ejercicio 20 - Tema 5
 * 
 * 
 */


public class ejercicio20 {
	
	public static void main (String[] args) {
		
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = System.console().readLine();
    
    int altura = 1;
    int i = 0;
    int espaciosDelante = alturaIntroducida - 1;
    int espacios2 = 0;
    
    while (altura < alturaIntroducida) {

      for (i = 1; i <= espaciosDelante; i++) {
        System.out.print(" ");
      }

      System.out.print(relleno);
      for (i = 1; i < espacios2; i++) {
        System.out.print(" ");
      }
      
      if (altura>1) {
        System.out.print(relleno);
      }
      
      System.out.println();
      altura++;
      espaciosDelante--;
      espacios2 += 2;
    } 

    for (i = 1; i < altura*2; i++) {
      System.out.print(relleno);
}
    
	}
}

