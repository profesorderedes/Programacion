package hoja2;

public class Ejer18 {

	public static void main(String[] args) {

		/*
		 * Añade al ejercicio anterior un bucle donde se busque en el array quién tiene
		 * la nota más baja. La salida debería ser algo como:
		 * "Juana Herranz tiene la nota más baja, un 4".
		 */

		String[][] calificaciones = { { "Jose Luis Martínez", "7" }, { "Antonia Ruiz", "9" }, { "Juana Herranz", "4" },
				{ "Marcos Ramírez", "10" }, { "Alberto López", "7" } };

		int suma = 0;
		int posMin = 0, posMax = 0;

		for (int fila = 0; fila < calificaciones.length; fila++) {

			System.out.println("--> ");

			for (int columnas = 0; columnas < calificaciones[0].length; columnas++) {
				System.out.println(calificaciones[fila][columnas]);

			}
			System.out.println();
			suma = suma + Integer.parseInt(calificaciones[fila][1]);
		}

		for (int fila = 0; fila < calificaciones.length; fila++) {

			if (Integer.parseInt(calificaciones[fila][1]) < Integer.parseInt(calificaciones[posMin][1])) {
				posMin = fila;
			}

		}

		System.out.println("La nota media es de: " + (double) suma / calificaciones.length);
		System.out.println("La nota más baja la tiene " + calificaciones[posMin][0] + " con una nota de "
				+ calificaciones[posMin][1]);

		for (int fila = 0; fila < calificaciones.length; fila++) {

			if (Integer.parseInt(calificaciones[fila][1]) > Integer.parseInt(calificaciones[posMax][1])) {
				posMax = fila;
			}

		}

		System.out.println("La nota más alta la tiene " + calificaciones[posMax][0] + " con una nota de "
				+ calificaciones[posMax][1]);

	}

}