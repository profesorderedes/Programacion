package ejemplosCadenas;

public class Ejemplo08Split {

	public static void main(String[] args) {

		String frase = "Bien hecho es mejor que bien dicho";

		String[] palabras = frase.split(" ");

		System.out.println("Frase descompuesta en palabras sueltas:");
		for (int i = 0; i < palabras.length; i++) {

			System.out.println(palabras[i]);

		}

	}

}
