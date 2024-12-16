package ejerciciosCadenas;

public class Ejer18 {

	public static void main(String[] args) {

		String frase = "érase una vez";

		// Separamos la cadena en palabras.
		String[] palabras = frase.split(" ");

		// Recorremos el array de palabras mostrando cada palabra con la
		// primera letra mayúscula.
		for (int i = 0; i < palabras.length; i++) {
			
			System.out.print(palabras[i].toUpperCase().charAt(0));

			for (int j = 1; j < palabras[i].length(); j++) {
				System.out.print(palabras[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

}
