/*
 /*
 * Ejercicio 11 - Tema 4
 * Un programa dada la hora determinada (h y s) calcule los s que faltan
 * para llegar a la media noche.
 */


public class ejercicio11 {
	
	public static void main (String[] args) {
		
    System.out.println ("Primero, introduzca la hora actual: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.println ("Ahora, introduzca los minutos: ");
    int minuto = Integer.parseInt(System.console().readLine());
    
    
    
    int segundosAhora = (hora * 3600) + (minuto * 60);
    int segundosMediaNoche = ((24 * 3600) - segundosAhora);
    
    System.out.print ("Faltan " + segundosMediaNoche + "s para llegar a media noche.");
  }
}

