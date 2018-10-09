/*
 * Ejercicio 9 - Tema 4
 * Un programa que resuelva una ecuación de segundo grado.
 */


public class ejercicio9 {

  public static void main(String[] args) {

    double a;
    double b;
    double c;
    double x1;
    double x2;

    System.out.print("Resolver ecuacion de segundo grado \n");

    System.out.print("Por favor, introduzca el valor de a: \n");

    a = Double.parseDouble(System.console().readLine());

    System.out.print("Por favor, introduzca el valor de b: \n");

    b = Double.parseDouble(System.console().readLine());

    System.out.print("Por favor, introduzca el valor de c: \n");

    c = Double.parseDouble(System.console().readLine());
    

    if ((a == 0) && (b == 0) && (c == 0)){

      System.out.println("La ecuación tiene infinitas soluciones.");

    }
    if ((a == 0) && (b == 0) && (c != 0)) {
      
      System.out.println("La ecuación no tiene solución.");
      
    }
    if ((a != 0) && (b != 0) && (c ==0 )){
     
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));

    }
    if ((a == 0) && (b != 0) && (c != 0)) {
    
      System.out.println("x1 = x2 = " + (-c / b));
    
    }
    if ((a != 0) && (b != 0) && (c != 0)) {

      double discriminante = b*b - (4 * a * c);
      //double discriminante = ((b*b)-4*a*c);    {Fallaba la expresión}

    if (discriminante <0){

      System.out.println("No se puede calcular");
    
    } else {

      double raiz = Math.sqrt(discriminante);

      x1 = ((-b +raiz)/(2*a));
      x2 = ((-b -raiz)/(2*a));

      System.out.printf("x1 = %.2f \n",x1);
      System.out.printf("x2 = %.2f \n",x2);

    }
  }  
  }
}
