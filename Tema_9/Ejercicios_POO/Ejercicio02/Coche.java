/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.Ejercicios_POO.Ejercicio02;

/**
 *
 * @author laura
 */
public class Coche extends Vehiculo {

  private int cilindros;

  public Coche(int c) {
    super();
    this.cilindros = c;
  }

  public void quemaRueda() {
    System.out.println("¡Cuanto humo!");
  }
}
