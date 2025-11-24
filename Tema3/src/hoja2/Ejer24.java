package hoja2;

// Actividad: buscar el "mínimo de este array" (la primera palabra por
// orden alfabético).

public class Ejer24 {

	public static void main(String[] args) {

		String[] nombres = { "Pedro", "María", "Carlos", "Nicolás" };

		int posMin = 0;

		for (int i = 1; i < nombres.length; i++) {

			if (nombres[i].compareTo(nombres[posMin]) < 0) {
				posMin = i;
			}
		}

		System.out.println("El primer nombre, alfabéticamente, es " + nombres[posMin] + ".");

	}

}
