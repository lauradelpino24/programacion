/*
 * 6. Implementa el control de acceso al área restringida de un
 *    programa. Se debe pedir un nombre de usuario y una contraseña. Si
 *    el usuario introduce los datos correctamente, el programa dirá
 *    "Ha accedido al área restringida". El usuario tendrá un máximo de
 *    3 oportunidades. Si se agotan las oportunidades el programa dirá
 *    "Lo siento, no tiene acceso al área restringida". Los nombres de
 *    usuario con sus correspondientes contraseñas deben estar
 *    almacenados en una estructura de la clase HasMap.
 */
package tema10;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args) {
    
    HashMap<String, String> a = new HashMap<String, String>();
    Scanner s = new Scanner(System.in);
    
    String usuario;
    String clave;
    int o = 3;
    
    a.put("admin", "admin");
    a.put("laura", "1234");
    a.put("usuario", "010203");
    
    System.out.println("Por favor, introduzca usuario y contraseña. Tienes 3 intentos: ");
    
      while (o > 0) {	
	System.out.print("Introduce un nombre de usuario: ");
	String user = s.nextLine().toLowerCase();
			
	System.out.print("Introduce una contraseña: ");
	String passwd = s.nextLine().toLowerCase();
	System.out.println();
			
	if (a.containsKey(user) && a.containsValue(passwd)) {
				
          if (a.get(user).equals(passwd)) {
					
            System.out.println("Ha accedido al área restringida");
            o = 0;
          } else {
					
            o -= 1;
					
            if (o == 0) {

              System.out.println("Lo siento, no tiene acceso al área restringida");
            }
          }
				
	} else {
				
          o -= 1;
				
            if (o == 0) {
					
              System.out.println("Lo siento, no tiene acceso al área restringida");
            }
	}
      }
  }  
}
