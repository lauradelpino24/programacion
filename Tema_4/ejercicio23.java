/*
 * Ejercicio 23 - Tema 4
 * Un programa que calcule el precio final de un producto según algunas condiciones.
 */


public class ejercicio23 {
	
	public static void main (String[] args) {
		
    System.out.print("Introduzca la base imponible: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIVA = System.console().readLine();
    
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String promocion = System.console().readLine();
    
    int tipoIVANum = 0;
    
    switch(tipoIVA) {
      case "general":
        tipoIVANum = 21;
        break;
      case "reducido":
        tipoIVANum = 10;
        break;
      case "superreducido":
        tipoIVANum = 4;
        break;
      default:
        System.out.println("El tipo de IVA introducido no es correcto.");
    }
    
    double iva = base * tipoIVANum / 100;
    double precioReal = base + iva;
    
    double descuento = 0;
    
    switch(promocion) {
      case "nopro":
        break;
      case "mitad": // descuenta la mitad
        descuento = precioReal / 2;
        break;
      case "meno5": // descuenta 5€
        descuento = 5;
        break;
      case "5porc": // descuenta el 5%
        descuento = precioReal * 0.05;
        break;
      default:
        System.out.println("El código promocional introducido no es correcto.");
    }
    
    double total = precioReal - descuento;
    
    System.out.printf("Base imponible       %6.2f\n", base);
    System.out.printf("IVA (%2d%%)            %6.2f\n", tipoIVANum, iva);
    System.out.printf("Precio con IVA       %6.2f\n", precioReal);
    System.out.printf("Cód. promo. (%5s) -%6.2f\n", promocion, descuento);
    System.out.printf("TOTAL                %6.2f", total);
	}
}

