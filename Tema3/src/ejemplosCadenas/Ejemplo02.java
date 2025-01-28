package ejemplosCadenas;

public class Ejemplo02 {

	public static void main(String[] args) {

		String frase = "Mi carro me lo robaron";
		System.out.println("El carácter en la posición 3 es " + frase.charAt(3) + ".");

		// Usando .length() y charAt() podemos recorrer una cadena carácter a
		// carácter.
		String palabra = "Espacial";
		for (int i = 0; i < palabra.length(); i++) {
			System.out.println(palabra.charAt(i));
		}

	}
}
