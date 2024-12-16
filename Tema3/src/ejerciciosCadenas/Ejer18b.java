package ejerciciosCadenas;

// Versión del ejercicio usando un sólo bucle. Usando substring().

public class Ejer18b {

	public static void main(String[] args) {

		String frase = "érase una vez";
		String fraseModificada = "";

		// Separamos la cadena en palabras.
		String[] palabras = frase.split(" ");

		// Recorremos el array de palabras mostrando cada palabra con la
		// primera letra mayúscula.
		for (int i = 0; i < palabras.length; i++) {

			fraseModificada = fraseModificada + palabras[i].toUpperCase().charAt(0) + palabras[i].substring(1) + " ";

		}

		System.out.println(fraseModificada);

	}

}
