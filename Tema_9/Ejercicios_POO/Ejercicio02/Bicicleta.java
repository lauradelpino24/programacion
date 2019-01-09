
package tema9.Ejercicios_POO.Ejercicio02;


public class Bicicleta extends Vehiculo{
  
  private String color;
  
  public Bicicleta(String c){
    this.color = c;
  }
  
  public void hazCaballito() {
    System.out.println("Estoy haciendo el caballito");
  }
}
