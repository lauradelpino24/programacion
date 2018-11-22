
import java.util.Scanner;
import static tema8.PruebaFunciones.invierte;

/*
 * Ejercicios del 1 al 14
 */

/**
 *
 * @author laura
 */
public class PrimeraTanda {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca un número (para saber si es capicua): ");
    int n = Integer.parseInt(s.nextLine());
    System.out.println(esCapicua(n));
    
    System.out.println("Introduzca un número (para saber si es primo): ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println(esPrimo(numero));
  }
  
  /**
   * Voltea un número. 
   * Por ejemplo: 1234 y devuelve 4321.
   * @param n
   * @return 
   */
  public static int voltea(int n){
  
    int volteado = 0;
    
    while (n > 0) {
      volteado = (volteado * 10) + (n % 10);
      n /= 10;
    }
    return volteado; 
    }
  
  /**
   * Dice si un número es capiúa o no. 
   * Por ejemplo: 2442: true , 1234: false.
   * @param n
   * @return 
   */
  public static boolean esCapicua(int n) {
    return n == voltea(n);
  }
  
  /**
   * Dice si un número es primo o no. 
   * Por ejemplo: 7: true , 1: false.
   * @param numero
   * @return 
   */
  
  public static boolean esPrimo(int numero){
    boolean primo = true;
    
    for(int i = 2; i < numero; i++){
      if ((numero % i) == 0){
        primo = false;
      }
    }
   return primo; 
  }
  
}
