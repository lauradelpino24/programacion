/*
 * Ejercicio 12 - Tema 4
 * Un minicuestionario de 10 preguntas y cada acierto suma un punto,
 * después que se sumen todos los puntos.
 */


public class ejercicio12 {
	
	public static void main (String[] args) {
		
    int puntos = 0;
    
    System.out.println ("Pregunta 1:");
    System.out.println ("¿Qué se usa para dar un salto de línea en html?");
    System.out.println ("A. br");
    System.out.println ("B. salt");
    System.out.println ("C. ln");
    System.out.println ("Escribe tu respuesta:");
    String respuesta1 = (System.console().readLine());
    
    if (respuesta1.equals("A")) {
        puntos ++;
    }
    
    System.out.println ("Pregunta 2:");
    System.out.println ("¿Que quiere decir que una BBDD sea integra?");
    System.out.println ("A. Que sea completa");
    System.out.println ("B. Que no tenga fallos:");
    System.out.println ("C. Que sea actualizable");
    System.out.println ("Escribe tu respuesta:");
    String respuesta2 = (System.console().readLine());
    
    if (respuesta2.equals("A")) {
        puntos ++;
    }
    
    System.out.println ("Pregunta 3:");
    System.out.print ("¿Para poner un hipervínculo en una página, ");
    System.out.println ("que se usa?");
    System.out.println ("A. link");
    System.out.println ("B. href");
    System.out.println ("C. a");
    System.out.println ("Escribe tu respuesta:");
    String respuesta3 = (System.console().readLine());
    
    if (respuesta3.equals("C")) {
        puntos ++;
    }
    
    System.out.println ("Pregunta 4:");
    System.out.print ("¿Para insertar un hiperenlace en una página, ");
    System.out.println ("que se usa?");
    System.out.println ("A. link");
    System.out.println ("B. href");
    System.out.println ("C. a");
    System.out.println ("Escribe tu respuesta:");
    String respuesta4 = (System.console().readLine());
    
    if (respuesta4.equals("B")) {
        puntos ++;
    }
    
    System.out.println ("Pregunta 5:");
    System.out.print ("¿Cuál de los siguientes tipos de datos tiene, ");
    System.out.println ("más precisión?");
    System.out.println ("A. int");
    System.out.println ("B. double");
    System.out.println ("C. float");
    System.out.println ("Escribe tu respuesta:");
    String respuesta5 = (System.console().readLine());
    
    if (respuesta5.equals("B")) {
        puntos ++;
    }
    
    System.out.println ("Pregunta 6:");
    System.out.println ("¿Con que periférico controlas el cursor? ");
    System.out.println ("A. teclado");
    System.out.println ("B. auriculares");
    System.out.println ("C. mouse");
    System.out.println ("Escribe tu respuesta:");
    String respuesta6 = (System.console().readLine());
    
    if (respuesta6.equals("C")) {
        puntos ++;
    }
    
    System.out.println ("Pregunta 7:");
    System.out.println ("¿En qué categorías se dividen los periféricos?");
    System.out.println ("A. externos e internos");
    System.out.println ("B. principales y secundarios:");
    System.out.println ("C. entrada y salida");
    System.out.println ("Escribe tu respuesta:");
    String respuesta7 = (System.console().readLine());
    
    if (respuesta7.equals("C")) {
        puntos ++;
    }
    
    System.out.println ("Pregunta 8:");
    System.out.print ("¿Cuál es la diferencia entre hardware y ");
    System.out.println ("software?");
    System.out.println ("A. hardware se puede ver y tocar y software también.");
    System.out.println ("B. hardware se puede ver y tocar y software a veces.");
    System.out.println ("C. hardware se puede ver y tocar software no.");
    System.out.println ("Escribe tu respuesta:");
    String respuesta8 = (System.console().readLine());
    
    if (respuesta8.equals("C")) {
        puntos ++;
    }
    
    System.out.println ("Pregunta 9:");
    System.out.println ("¿Quién creó la primera impresora? ");
    System.out.println ("A. Steve Jobs");
    System.out.println ("B. Charles Babbage");
    System.out.println ("C. Honrad Zuse ");
    System.out.println ("Escribe tu respuesta:");
    String respuesta9 =(System.console().readLine());
    
    if (respuesta9.equals("B")) {
        puntos ++;
    }
    
    System.out.println ("Pregunta 10:");
    System.out.println ("¿Quién creó el primer ordenador? ");
    System.out.println ("A. Steve Jobs");
    System.out.println ("B. Charles Babbage");
    System.out.println ("C. Honrad Zuse ");
    System.out.println ("Escribe tu respuesta:");
    String respuesta10 = (System.console().readLine());
    
    if (respuesta1.equals("C")) {
        puntos ++;
    }
    
    System.out.println ("Su puntuación es: " + puntos);
      
	}
}

