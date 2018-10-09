/*
 * Ejercicio 21 - Tema 4
 * Un programa que diga si estás aprobado o no y si recuperas estás apto o no.
 */


public class ejercicio21 {
	
	public static void main (String[] args) {
    
		System.out.print ("Introduzca la primera nota: ");
    
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print ("Introduzca la segunda nota: ");
    
    double nota2 = Double.parseDouble(System.console().readLine());
    
    double media = ((nota1 + nota2) / 2);
    
    if ((nota1 > 10 || nota1 < 0) || (nota2 > 10 || nota2 < 0)) {
      
      System.out.print ("Introduce una nota válida");
      
    } else {
    
      if (media < 5) {
        
        System.out.print ("¿El examen de recuperación ha sido apto o no apto? ");
        
        String recu = System.console().readLine().toLowerCase();
        
        if ((!recu.equals("apto")) && (!recu.equals("no apto"))) {
          
          System.out.print ("Tienes que poner apto o no apto");
          
        } else if (recu.equals("apto")){
            
          System.out.print ("Su nota es un 5.");
            
        } else {
              
          System.out.print ("Su media es " + media);
            
        }
        
      } else {
        
        System.out.print ("Tu media es " +  media);
      }
    }
	}
}

