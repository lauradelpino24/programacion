/*
 * Ejercicio 20 - Tema 4
 * Un programa que diga si un número entero positivo introducido por teclado
 * es capicúa. Se permiten números de hasta 5 cifras.
 */


public class ejercicio20 {
	
	public static void main (String[] args) {
		
    System.out.print ("Introduzca un número entero positivo (5 cifras máx): ");
    
    int num = Integer.parseInt(System.console().readLine());
    
    if (num < 10) { // 1 cifra
      
      System.out.print ("El número sólo tiene un cifra, no puede ser capicúo.");
      
    } else if (( num >= 10) && (num < 100)) { // 2 cifras
          
      int cifra1 = num / 10; //1ª cifra
      int cifra2 = num % 10; // 2ª cifra
      
      if (cifra1 == cifra2) {
          
        System.out.print ("El número " + num + " es capicúo");
          
        } else {
            
          System.out.print ("El número no es capicúo");
            
          }
        
    } else if ((num >= 100) && (num < 1000)) { // 3 cifras
          
      System.out.print ("Este número no puede ser capicúo.");
          
    } else if ((num >= 1000) && (num < 10000)) { // 4 cifras
          
      int par1 = num / 100; //2 primeras cifras
          
      int cifra1 = par1 / 10; //última cifra
      int cifra2 = par1 % 10; //1ª cifra
        
      int par2 = num % 100; // 2 últimas cifras
        
      int cifra3 = par2 / 10; //2ª cifra
      int cifra4 = par2 % 10; //3ª cifra
        
        
      if (cifra1 == cifra4 && cifra2 == cifra3){
          
        System.out.print ("El número " + num + " es capicúo");
          
        } else {
            
          System.out.print ("El número no es capicúo");
            
          }
          
      } else if (num >= 10000 && num < 100000) { // 5 cifras
        
        System.out.print ("Este número no puede ser capicúo.");
          
      } else {
        
        System.out.println("El número puede tener 5 cifras como máximo. ");
          
    }
  }
}
