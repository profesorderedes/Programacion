package ejemplosArrays;

public class Ejemplo09Tablas {

	public static void main(String[] args) {

		// Declaramos un array bidimensional de 4 filas x 3 columnas.

		String[][] personal = new String[4][3];

		// Esquema de cada fila:
		// [Nombre] [Teléfono] [Código postal]

		// Rellenamos la primera fila.
		personal[0][0] = "Pedro";
		personal[0][1] = "971001122";
		personal[0][2] = "07001";

	}

}
