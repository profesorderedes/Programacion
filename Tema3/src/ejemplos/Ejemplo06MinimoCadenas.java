package ejemplos;

public class Ejemplo06MinimoCadenas {

	public static void main(String[] args) {

		String[] nombres = { "Lucía", "Ana", "Manuel", "Francisco" };

		/*
		 * Método String.compareTo().
		 * 
		 * cadena1.compareTo(cadena2) devuelve: negativo si cadena1 va antes que cadena2
		 * (alfabéticamente) positivo si cadena1 va después que cadena2
		 * (alfabéticamente) cero si las dos cadenas son iguales
		 */
		int posMin = 0;
		for (int i = 1; i < nombres.length; i++) {

			if (nombres[i].compareTo(nombres[posMin]) < 0) {
				posMin = i;
			}

		}

		System.out.println(
				"La primera palabra alfabéticamente es " + nombres[posMin] + ". Y está en la posición " + posMin + ".");

	}

}
