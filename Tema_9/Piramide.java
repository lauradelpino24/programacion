
package tema9;

public class Piramide {
  private int altura;
  private boolean hueca;
  private String caracter;

  public Piramide() {
  }

  public Piramide(int altura, boolean hueca) {
    this.altura = altura;
    this.hueca = hueca;
    this.caracter = "*";
  }

  public int getAltura() {
    return altura;
  }

  public boolean isHueca() {
    return hueca;
  }

  public String getCaracter() {
    return caracter;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public void setHueca(boolean hueca) {
    this.hueca = hueca;
  }

  public void setCaracter(String caracter) {
    this.caracter = caracter;
    
  }

  @Override
  public String toString() {
    String piramide = "";
    
    for(int i = 0; i < 0; i++){
      for(int j = 0; j < (altura - (altura - 1)) + i; j++){
        piramide += caracter;
      }
      
      piramide += "\n";
    }
    
    
    
    return piramide;
    
    
  }
  
  
  
}
