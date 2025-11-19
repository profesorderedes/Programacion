package hoja2;

public class Ejer13 {

	public static void main(String[] args) {

		double[][] medidas = { { 8.5, 1020, 40 }, { 14.2, 1021, 35 }, { 11, 1022, 45 }, { 7, 1023, 50 }, };

		System.out.println("REGISTROS METEOROLÓGICOS");
		System.out.println("========================");

		for (int fila = 0; fila < medidas.length; fila++) {

			System.out.print("> ");

			for (int columna = 0; columna < medidas[0].length; columna++) {
				System.out.print(medidas[fila][columna] + "\t");
			}

			System.out.println();

// System.out.println(tabla[i][0] + "\t" + tabla[i][1] + "\t" + tabla[i][2]);

		}

	}

}