package ejer2_4;

public class Ejercicio02 {

	public static void main(String[] args) {

		String[][] tienda = { { "Apple iPhone 13", "529", "Apple" }, { "Xiaomi Note 13", "113.50", "Qualcomm" },
				{ "Galaxy S24", "939", "Qualcomm" }, { "Apple iPhone 15", "789", "Apple" },
				{ "Motorola g24", "99.20", "Mediatek" } };

		int posMax = 0;
		double aumentoPrecio;

		System.out.println("Oferta de móviles");
		System.out.println("========================================");

		for (int fila = 0; fila < tienda.length; fila++) {

			for (int col = 0; col < tienda[0].length; col++) {
				System.out.print(tienda[fila][col] + "\t");
			}

			System.out.println(" ");
		}

		for (int fila = 1; fila < tienda.length; fila++) {

			if (Double.parseDouble(tienda[fila][1]) > Double.parseDouble(tienda[posMax][1])) {

				posMax = fila;
			}

		}

		System.out.println(
				"El móvil más caro es " + tienda[posMax][0] + ", con un precio de " + tienda[posMax][1] + " euros.");

		System.out.println("\nLos móviles con el procesador Qualcomm son:");

		for (int fila = 0; fila < tienda.length; fila++) {

			if (tienda[fila][2].equals("Qualcomm")) {
				System.out.println(" * " + tienda[fila][0]);

			}

		}

		System.out.println("Tras aumentar 5€ los precios de los móviles, quedan así:");

		for (int fila = 0; fila < tienda.length; fila++) {

			aumentoPrecio = Double.parseDouble(tienda[fila][1]) + 5;
			tienda[fila][1] = "" + aumentoPrecio;
		}

		for (int fila = 0; fila < tienda.length; fila++) {

			for (int col = 0; col < tienda[0].length; col++) {
				System.out.print(tienda[fila][col] + "\t");
			}

			System.out.println();
		}

	}

}