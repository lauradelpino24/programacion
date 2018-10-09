/*
 * Ejercicio 22 - Tema 4
 */


public class ejercicio22 {
	
	public static void main (String[] args) {
		
    System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
    String dia = System.console().readLine();

    int numDia = 0;

    switch(dia) {
      case "lunes":
        numDia = 0;
        break;
      case "martes":
        numDia = 1;
        break;
      case "miércoles":
      case "miercoles":
        numDia = 2;
        break;
      case "jueves":
        numDia = 3;
        break;
      case "viernes":
        numDia = 4;
        break;
      default:
        System.out.print("El día introducido no es correcto.");
    }
    
    System.out.println("A continuación introduzca la hora: ");
    
    System.out.print("Hora: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int minTotal= (4 * 24 * 60) + (15 * 60);
    int minActual = (numDia * 24 * 60) + (horas * 60) + minutos;
    
    System.out.print("Faltan " + (minTotal - minActual) + " minutos para llegar al fin de semana.");
	}
}

