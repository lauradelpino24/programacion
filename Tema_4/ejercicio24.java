/*
 * Ejercicio 21 - Tema 4
 * Un programa que diga si estás aprobado o no y si recuperas estás apto o no.
 */
 
public class ejercicio24 {
  public static void main(String[] args) {
    
    int opcion;
    int dias;
    int estado;

    double sueldobase = 0;
    double sueldodietas;
    double sueldobruto;
    double irpf = 0;
    double cuantiairpf;
    

    System.out.println("1 - Programador junior");
    System.out.println("2 - Prog. senior");
    System.out.println("3 - Jefe de proyecto");

    System.out.println("Introduzca el cargo del empleado (1 - 3):");

    opcion = Integer.parseInt(System.console().readLine());

    System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");

    dias = Integer.parseInt(System.console().readLine());

    System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado):");

    estado = Integer.parseInt(System.console().readLine());

    switch (opcion) {
      case 1:

        sueldobase = 950;
        break;
      
      case 2:
      
        sueldobase = 1200;
        break;
      
      case 3:

        sueldobase = 1600;
        break;

      default:
        System.out.println("No ha elegido ninguna opcion correcta.");
        break;
    }

    sueldodietas = dias*30;
    sueldobruto = sueldodietas + sueldobase;

    if (estado == 1){

      irpf = 25;
    
    }else if (estado == 2){

      irpf = 20;

    }else {

      System.out.println("No ha elegido correctamente el estado civil");

    }

    cuantiairpf = (sueldobruto * irpf)/100;

    System.out.printf("#####################################\n");
    System.out.printf("# Sueldo base                %7.2f#\n",sueldobase);
    System.out.printf("# Dietas (%2d viajes)         %7.2f#\n",dias,sueldodietas );
    System.out.printf("#####################################\n");
    System.out.printf("# Sueldo bruto               %7.2f#\n",sueldobruto);
    System.out.printf("# Retencion IRPF (%.0f%%)       %7.2f#\n",irpf,cuantiairpf);
    System.out.printf("#####################################\n");
    System.out.printf("# Sueldo neto                %7.2f#\n",sueldobruto-cuantiairpf);
    System.out.print("#####################################\n");



   }
}
