package ejer2_3;

public class Act2 {

	public static void main(String[] args) {

		String[][] moviles = { { "Apple iPhone 13", "529", "Apple" }, { "Xiaomi Note 13", "113.50", "Qualcomm" },
				{ "Galaxy S24", "939", "Qualcomm" }, { "Apple iPhone 15", "789", "Apple" },
				{ "Motorola g24", "99.20", "Mediatek" } };

		int posMax = 0;

		System.out.println("Ofertas de móviles");
		System.out.println("==================================");

		for (int filas = 0; filas < moviles.length; filas++) {
			for (int col = 0; col < moviles[0].length; col++) {
				System.out.print(moviles[filas][col] + "\t");
			}
			System.out.println();

		}

		for (int i = 0; i < moviles.length; i++) {
			if (Double.parseDouble(moviles[i][1]) > Double.parseDouble(moviles[posMax][1])) {
				posMax = i;
			}

		}

		System.out.println(
				"\nEl móvil más caro es el " + moviles[posMax][0] + ", que vale " + moviles[posMax][1] + " euros.");
		System.out.println("\nLos móviles con procesador Qualcomm son:");
		for (int fila = 0; fila < moviles.length; fila++) {
			if (moviles[fila][2].equals("Qualcomm")) {

				System.out.println("\n * " + moviles[fila][0]);

			}
		}

		System.out.println("\nTras aumentar 5€ los precios de los móviles, quedan así:");

		for (int fila = 0; fila < moviles.length; fila++) {

			double nuevoPrecio = Double.parseDouble(moviles[fila][1]) + 5;
			moviles[fila][1] = String.valueOf(nuevoPrecio);

			for (int col = 0; col < moviles[0].length; col++) {
				System.out.print(moviles[fila][col] + "\t");
			}
			System.out.println();

		}

	}

}
