package tema9.Ejercicios_POO.Ejercicio01;


public class PruebaCaballo {

  public static void main(String[] args) {
    
    Caballo a = new Caballo("Avra", "marrón moteado", 6, 24);
    Caballo l = new Caballo("Lykos", "negro", 8, 61);
    
    System.out.println("Hola, me llamo " + a.getNombre());
    a.cabalga();
    a.relincha();
      
    System.out.println("Hola, yo soy " + l.getNombre());
    l.rumia();
    l.cabalga();
  }
  
}
