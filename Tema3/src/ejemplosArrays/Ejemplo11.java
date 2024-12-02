package ejemplosArrays;
import java.util.Arrays;

public class Ejemplo11 {

	public static void main(String[] args) {

		// String[][] salarios = new String[4][3];

		String[][] salarios = { { "Sánchez", "María", "1800" }, { "Rodríguez", "Juan", "1700" },
				{ "Pérez", "Nuria", "1750" }, { "López", "Luis", "1800" } };

		System.out.println("Salarios de la empresa");
		System.out.println("===================================");
		for (int fila = 0; fila < salarios.length; fila++) {

			// En la fila en la que estemos (fila) vamos recorriendo
			// todas las columnas.
			for (int col = 0; col < salarios[0].length; col++) {
				System.out.print(salarios[fila][col] + "\t");
			}
			System.out.println();

		}

		// En Java, un array bidimensional es un array unidimensional
		// donde cada posición contiene otro array (fila).
		System.out.println("\nLa fila 0 de salarios es " + Arrays.toString(salarios[0]));
		System.out.println("\nLa fila 1 de salarios es " + Arrays.toString(salarios[1]));

		// El tamaño (.length) de un array bidimensional es el
		// número de filas.
		System.out.println("\nNúmero de filas: " + salarios.length);

		// El tamaño (.length) de una fila es el número de columnas.
		System.out.println("\nNúmero de columnas: " + salarios[0].length);

	}
}
