/*
 * Ejercicio 13 - Tema 4
 * Un programa que ordene tres números enteros introducidos por teclado.
 */


public class ejercicio13 {
	
	public static void main (String[] args) {
		 System.out.print("Introduce un número entero: ");
     int num1 = Integer.parseInt(System.console().readLine());
     
     System.out.print("Introduce otro número entero: ");
     int num2 = Integer.parseInt(System.console().readLine());
     
     System.out.print("Introduce un número entero más: ");
     int num3 = Integer.parseInt(System.console().readLine());
     
     int numMenor = 0;
     int num = 0;
     int numMayor = 0;
     
     if ((num1 < num2) && (num1 < num3)) {
        
        numMenor = num1;
        
        if ((num2 > num1) && (num2 > num3)) {
          
          numMayor = num2;
          num = num2;
        
      } else if ((num3 > num1) && (num3 > num2)){
         
         numMayor = num3;
         num = num2;
         
      } else{
           
           num = num2;
           numMayor = num3;
           
        } 
        
  } else if ((num2 < num1) && (num2 < num3)) {
        
        numMenor = num2;
        
        if ((num1 > num2) && (num1 > num3)){
          
          numMayor = num1;
          num = num3;
          
          } else if ((num3 > num1) && (num3 > num1)) {
            
            num = num1;
            numMayor = num3;
            }
            
        } else if ((num3 < num1) && (num3 < num2)) {
          
          numMenor = num3;
          
          if ((num2 > num1) && (num2 > num3)) {
            
            numMayor = num2;
            num = num1;
            
            } else if ((num1 > num2) && (num1 > num3)) {
              
              numMayor = num1;
              num = num2;
              
            } else {
              
              num = num2;
              numMayor = num1;
              
            }
          
          } else {
            
            if (num1 == num2) {
              numMenor = num1;
              num = num2;
              numMayor = num3;
              
              } else if (num1 == num3) {
                
                numMenor = num1;
                num = num3;
                numMayor = num2;
                
              } else if (num2 == num3) {
                
                numMenor = num2;
                num = num3;
                numMayor = num1;
                
                } 
            }
        
        System.out.print ("1º orden: " + num1 + "," + num2 + ",");
        System.out.println (num3);
        System.out.print ("Ordenados: " + numMenor + "," + num + ",");
        System.out.println (numMayor);
	}
}

