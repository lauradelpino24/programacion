/*
 * Ejercicio 7 - Tema 5
 * Realiza el control de acceso a una caja fuerte.
 */


public class ejercicio7 {
	
	public static void main (String[] args) {
		
    int intentos = 4;
    while ( intentos >= 0 ){
      
      System.out.print("Introduce la combinación (4 cifras): ");
      int num = Integer.parseInt(System.console().readLine());
      
      int combinacion = 2424;
      
      if ( num == combinacion ) {
        
        System.out.print("La caja fuerte se ha abierto satisfactoriamente.");
        break;
        
        } else {
          
          System.out.println("Lo siento, esa no es la combinación.");
          intentos--;
          
          }
          if(intentos == 0){
          
          System.out.print("Se te han acabado las oportunidades.");
        }
	}
}
}
