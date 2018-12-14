package tema9;

public class PruebaGatos {
  public static void main(String[] args) {
    Gato erizo = new Gato("Erizo", "callejero", "hembra");
    Gato g = new Gato("Garfield", "romano", "macho");
    erizo.setEdad(3);
    erizo.setPeso(2.5);
    g.setEdad(20);
    
    // Datos de erizo
    System.out.print("Hola, soy ");
    if (erizo.getSexo().equals("hembra")) {
      System.out.print("una gata, ");
    } else {
      System.out.print("un gato, ");
    }
    System.out.print("me llamo " + erizo.getNombre());
    System.out.println(" y peso " + erizo.getPeso() + "Kg");
    System.out.println(g.getSexo());
    
    g.maulla();
    erizo.maulla();
    erizo.maulla(20);
    g.come("pescado");
    g.come("tarta de frambuesa");
    
    g.acicala();
    g.acicala(erizo);
    erizo.acicala(g);
  }
  
}