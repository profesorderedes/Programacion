package cadenas;

import java.util.Arrays;

public class Ejemplos {

	public static void main(String[] args) {

		// Método length.

		String frase = "No hay mal que por bien no venga";

		System.out.println("La frase \"" + frase + "\" tiene " + frase.length() + " caracteres.");

		// Método charAt.

		System.out.println("La primera letra de la frase " + "anterior es " + frase.charAt(0));

		// Método replace(char 'caracter_antiguo', char 'caracter_nuevo')

		System.out.println("La frase anterior, cambiando " + "las a por i queda:\n" + frase.replace('a', 'i'));

		// Método replace(CharSequence cadena_antigua, CharSequence cadena_nueva)

		System.out.println(
				"\nLa frase anterior cambiando " + "\"hay\" por \"haiga\" queda:\n" + frase.replace("hay", "haiga"));

		// Método indexOf(String textoABuscar)

		System.out.println("El texto \"hay\" aparece en la " + "posición " + frase.indexOf("hay"));
		System.out.println("El texto \"hola\" aparece en la " + "posición " + frase.indexOf("hola"));

		// Método lastIndexOf(String textoABuscar)

		System.out.println("Aquí se muestra en qué posición " + "se encuentra el último carácter \"a\"-> "
				+ frase.lastIndexOf("a") + "\n");

		// Método int compareTo(String textoPorComparar)

		String palabra1 = "gato";
		String palabra2 = "gato";
		String palabra3 = "Perro";
		String palabra4 = "delfín";

		palabra1 = palabra1.toUpperCase();
		palabra2 = palabra2.toUpperCase();
		palabra3 = palabra3.toUpperCase();
		palabra4 = palabra4.toUpperCase();

		System.out.println("Comparando gato con gato:");
		System.out.println(palabra1.compareTo(palabra2));

		System.out.println("Comparando gato con perro:");
		System.out.println(palabra1.compareTo(palabra3));

		System.out.println("Comparando gato con delfín:");
		System.out.println(palabra1.compareTo(palabra4));

		// Método String substring(int inicio, int fin)

		System.out.println("La segunda letra y las dos " + "siguientes de " + "la palabra " + palabra1 + " son: "
				+ palabra1.substring(1, 4));

		// Método String[ ] split(String separador)
		String palabrasSueltas[] = frase.split(" ");
		System.out.println("Las palabras sueltas de la " + "primera frase son:");
		System.out.println(Arrays.toString(palabrasSueltas));

		String contacto = "Castillo López, Adrián, " + "acastillo@iessonferrer.net";
		String campos[] = contacto.split(",");

		for (int i = 0; i < campos.length; i++) {
			System.out.println(campos[i]);
		}

		// Método String String.valueOf(número)

		float estatura = 1.7F;

		String estaturaComoString = String.valueOf(estatura);

		// Equivalente a:
		// String estaturaComoString = "" + estatura;

	}

}
