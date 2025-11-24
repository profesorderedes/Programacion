package hoja2;

import java.util.Arrays;

// Actividad: ordenar alfabéticamente el array de nombres siguiente.

public class Ejer25 {

	public static void main(String[] args) {

		String[] nombres = { "Pedro", "María", "Carlos", "Nicolás", "Baltasar" };

		int posMin;
		String aux;

		for (int i = 0; i < nombres.length - 1; i++) {

			// Buscamos el "menor" entre i y el final del array.
			posMin = i;
			for (int j = i + 1; j < nombres.length; j++) {
				if (nombres[j].compareTo(nombres[posMin]) < 0) {
					posMin = j;
				}
			}

			// Intercambiamos las posiciones i y posMin.
			aux = nombres[i];
			nombres[i] = nombres[posMin];
			nombres[posMin] = aux;

		}

		System.out.println("La lista de nombres, ordenada alfabéticamente, queda así:\n" + Arrays.toString(nombres));

	}

}
