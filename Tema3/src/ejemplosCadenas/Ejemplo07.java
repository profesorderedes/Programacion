package ejemplosCadenas;

// Programa que te dice qué palabra de un array es la primera
// en orden alfabético.

public class Ejemplo07 {

	public static void main(String[] args) {

		String[] palabras = { "gato", "hamster", "perro", "periquito", "canario", "ajolote" };

		int posMin = 0;
		for (int i = 1; i < palabras.length; i++) {

//			if(palabras[i] < palabras[posMin]) {
//				posMin = i;
//			}

			if (palabras[i].compareTo(palabras[posMin]) < 0) {
				posMin = i;
			}

		}

		System.out.println("La primera palabra, alfabéticamente, es " + palabras[posMin] + ".");
	}

}
