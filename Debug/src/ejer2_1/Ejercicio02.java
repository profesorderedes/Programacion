package ejer2_1;

public class Ejercicio02 {

	public static void main(String[] args) {

		String moviles[][] = { { "Apple iPhone 13", "529", "Apple" }, { "Xiaomi Note 13", "113.50", "Qualcomm" },
				{ "Galaxy S24", " 939", "Qualcomm" }, { "Apple iPhone 15", "789", "Apple" },
				{ "Motorola g24 ", "99.20", "Mediatek" }

		};

		System.out.println("Oferta de moviles\n================================================\n");
		// Mostramos el array bidimensional
		for (int fil = 0; fil < moviles.length; fil++) {

			for (int col = 0; col < moviles[fil].length; col++) {

				System.out.print(moviles[fil][col] + "\t\t");

			}
			System.out.println();
		}

		System.out.println();
		int posMax = 0;
// detectar los moviles mas baratos/caro 
		for (int fila = 0; fila < moviles.length; fila++) {

			if (Double.parseDouble(moviles[fila][1]) > Double.parseDouble(moviles[posMax][1])) {
				posMax = fila;
			}

		}

		System.out.println(
				"El movil mas caro es el " + moviles[posMax][0] + ", que vale " + moviles[posMax][1] + " euros\n");
		System.out.println("Los moviles con procesador Qualcomm son:");

		// Bucle que nos muestra que moviles llevan el procesador Qualcomm

		for (int i = 0; i < moviles.length; i++) {

			if (moviles[i][2].equals("Qualcomm")) {
				System.out.println("+ " + moviles[i][0]);
			}
		}
		System.out.println();

		double precioNuevo;
		for (int fil = 0; fil < moviles.length; fil++) {

			precioNuevo = Double.parseDouble(moviles[fil][1]) + 5;

			moviles[fil][1] = "" + precioNuevo;

			for (int col = 0; col < moviles[fil].length; col++) {

				System.out.print(moviles[fil][col] + "\t\t");

			}
			System.out.println();
		}

	}

}
