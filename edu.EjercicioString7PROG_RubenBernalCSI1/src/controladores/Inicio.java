/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

/**
 * Clase controladora de la aplicación
 * rbr - 061024
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 061024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		String frase = "Esto es una prueba";
		
		//Guardo en una variable de tipo entero la longitud del mensaje
		int longitud = frase.length();
		
		//Guardo en una variable de tipo string el mensaje con todo en mayúsculas
		String todoMayus = frase.toUpperCase();
		
		//Comparo el mensaje original con el que contiene todo en mayúscula
		boolean esIgual = frase.equals(todoMayus);
		
		//Imprimo el resultado de la comparación por consola
		System.out.println(esIgual);

	}

}
