package tema9;

public class Gato {
 private String nombre;
 private String color;
 private String raza;
 private String sexo;
 private int edad;
 private double peso;

 public String getNombre() {
   return nombre;
 }

 public double getPeso() {
   return peso;
 }

 public Gato(String n, String r, String s) {
   this.nombre = n;
   this.raza = r;
   this.sexo = s;
 }

 public String getColor() {
   return color;
 }

 public String getSexo() {
   return sexo;
 }

 public int getEdad() {
   return edad;
 }

 public void setEdad(int edad) {
   this.edad = edad;
 }

 public void setPeso(double peso) {
   this.peso = peso;
 }


 public void maulla() {
   System.out.println("miau");
 }

 public void maulla(int intensidad) {
   System.out.print("miau");
   for (int i = 0; i < intensidad; i++) {
     System.out.print("u");
   }
   System.out.println("");
 }


 public void come(String comida) {
   if (comida.toLowerCase().equals("pescado")) {
     System.out.println("Mmmmmmmm qué rico");
   } else {
     System.out.println("Lo siento, yo solo como pescado.");
   }
 }

 public void acicala() {
   System.out.println("Me estoy arreglando...");
 }

 public void acicala(Gato g) {
   if ((int)(Math.random() * 2) == 0) {
     System.out.println(this.nombre + ", me gusta mucho que me acicales");
   } else {
     System.out.println(this.nombre + ", déjame en paz");
   }
 }
}
