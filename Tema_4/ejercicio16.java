/*
 * Ejercicio 16 - Tema 4
 * Un test con V/F y cada respuesta en V suma 3 puntos, F nada.
 */


public class ejercicio16 {
	
	public static void main (String[] args) {
		
    int puntos = 0;
    
    System.out.println ("Pregunta 1:");
    System.out.print ("¿Tu pareja parece estar más inquieta de lo ");
    System.out.println ("normal sin ningún motivo aparente.");
    System.out.println ("V");
    System.out.println ("F");
    System.out.println ("Escribe tu respuesta:");
    String respuesta1 = (System.console().readLine().toUpperCase());
    
    if (respuesta1.equals("V")) {
        puntos += 3;
    }
    
    System.out.println ("Pregunta 2:");
    System.out.println ("Ha aumentado sus gastos de vestuario");
    System.out.println ("V");
    System.out.println ("F");
    System.out.println ("Escribe tu respuesta:");
    String respuesta2 = (System.console().readLine().toUpperCase());
    
    if (respuesta2.equals("V")) {
        puntos += 3;
    }
    
    System.out.println ("Pregunta 3:");
    System.out.print ("Ha perdido el interés que mostraba anteriormente ");
    System.out.println ("por ti");
    System.out.println ("V");
    System.out.println ("F");
    System.out.println ("Escribe tu respuesta:");
    String respuesta3 = (System.console().readLine().toUpperCase());
    
    if (respuesta3.equals("V")) {
        puntos += 3;
    }
    
    System.out.println ("Pregunta 4:");
    System.out.print ("Ahora se afeita y se asea con más frecuencia");
    System.out.print ("(si es hombre) o ahora se arregla el pelo");
    System.out.println ("y se asea con más frecuencia (si es mujer");
    System.out.println ("V");
    System.out.println ("F");
    System.out.println ("Escribe tu respuesta:");
    String respuesta4 = (System.console().readLine().toUpperCase());
    
    if (respuesta4.equals("V")) {
        puntos += 3;
    }
    
    System.out.println ("Pregunta 5:");
    System.out.print ("No te deja que mires la agenda se su teléfono");
    System.out.println ("móvil");
    System.out.println ("V");
    System.out.println ("F");
    System.out.println ("Escribe tu respuesta:");
    String respuesta5 = (System.console().readLine().toUpperCase());
    
    if (respuesta5.equals("V")) {
        puntos += 3;
    }
    
    System.out.println ("Pregunta 6:");
    System.out.println ("A veces tiene llamadas que dice no querer ");
    System.out.println ("contestar cuando estás tú delante");
    System.out.println ("V");
    System.out.println ("F");
    System.out.println ("Escribe tu respuesta:");
    String respuesta6 = (System.console().readLine().toUpperCase());
    
    if (respuesta6.equals("V")) {
        puntos += 3;
    }
    
    System.out.println ("Pregunta 7:");
    System.out.println ("Últimamente se preocupa más en cuidar la línea");
    System.out.println ("y/o estar bronceado/a");
    System.out.println ("V");
    System.out.println ("F");
    System.out.println ("Escribe tu respuesta:");
    String respuesta7 = (System.console().readLine().toUpperCase());
    
    if (respuesta7.equals("V")) {
        puntos ++;
    }
    
    System.out.println ("Pregunta 8:");
    System.out.print ("Muchos días viene tarde después de trabajar porque ");
    System.out.println ("dice tener mucho más trabajo");
    System.out.println ("V");
    System.out.println ("F");
    System.out.println ("Escribe tu respuesta:");
    String respuesta8 = (System.console().readLine().toUpperCase());
    
    if (respuesta8.equals("V")) {
        puntos += 3;
    }
    
    System.out.println ("Pregunta 9:");
    System.out.println ("Has notado que últimamente se perfuma más ");
    System.out.println ("V");
    System.out.println ("F ");
    System.out.println ("Escribe tu respuesta:");
    String respuesta9 =(System.console().readLine().toUpperCase());
    
    if (respuesta9.equals("V")) {
        puntos += 3;
    }
    
    System.out.println ("Pregunta 10:");
    System.out.print ("Se confunde y te dice que ha estado en sitios ");
    System.out.println ("donde no ha ido contigo");
    System.out.println ("V");
    System.out.println ("F ");
    System.out.println ("Escribe tu respuesta:");
    String respuesta10 = (System.console().readLine().toUpperCase());
    
    if (respuesta1.equals("V")) {
        puntos += 3;
    }
    
    if ( puntos == 0 || puntos <=10 ) {
    
    System.out.print ("¡Enhorabuena! tu pareja parece ser totalmete ");
    System.out.println ("fiel");
    
    } else if ( puntos == 11 || puntos <= 22){
      
    System.out.print ("Quizás exista el preligro de otra persona en ");
    System.out.print ("su vida o en su mente, aunque seguramente");
    System.out.println ("será algo sin importancia. No bajes la guardia.");
      
    } else {
      
    System.out.print ("Tu pareja tiene todos los ingredientes para estar ");
    System.out.print ("viviendo un romance con otra persona. Te aconsejamos");
    System.out.print ("que indagues un poco más y averigües que es lo");
    System.out.println ("que está pasando por su cabeza.");
      
      }
	}
}

