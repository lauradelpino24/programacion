/*
 * Ejercicio 2 - Tema 9
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú.
 */
package tema9.Ejercicios_POO.Ejercicio02;



public class Vehiculo {
  
public Vehiculo(){
  this.kilometrosRecorridos = 0;
}

  
  private static int vehiculosCreados;
  private static int kilometrosTotales;
  private int kilometrosRecorridos;

  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }

  public static void setVehiculosCreados(int vehiculosCreados) {
    Vehiculo.vehiculosCreados = vehiculosCreados;
  }

  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public static void setKilometrosTotales(int kilometrosTotales) {
    Vehiculo.kilometrosTotales = kilometrosTotales;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public void setKilometrosRecorridos(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }
  
  public void recorre(int km) {
    this.kilometrosRecorridos += km;
    Vehiculo.kilometrosTotales += km;
  }
  
}
