package miscelanea;

public class OrdenarArrayBidimensional2 {

	public static void main(String[] args) {

		String[][] notas = { { "Jose Luis Martínez", "7" }, { "Antonia Ruiz", "9" }, { "Marcos Ramírez", "10" },
				{ "Juana Herranz", "4" }, { "Alberto López", "7" } };

		// Ordenar el array por nombre.

		int posMin;
		// La variable aux almacenará una fila de la tabla.
		String[] aux = new String[2];

		for (int i = 0; i < notas.length - 1; i++) {

			// Buscamos la fila posMin donde estará el primer 
			// nombre alfabéticamente desde la posición i 
			// hasta el final.
			posMin = i;
			for (int j = i; j < notas.length; j++) {
				if (Double.parseDouble(notas[j][1]) < Double.parseDouble(notas[posMin][1])) {
					posMin = j;
				}
			}

			// Intercambiamos las filas i y posMin.
			aux = notas[posMin];
			notas[posMin] = notas[i];
			notas[i] = aux;

		}

		// Mostramos la tabla ordenada.
		System.out.printf("%-20s %5s\n", "Nombre", "Nota");
		System.out.printf("%-20s %5s\n", "====================", "====");
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("%-20s %5s\n", notas[i][0], notas[i][1]);
		}

	}

}
