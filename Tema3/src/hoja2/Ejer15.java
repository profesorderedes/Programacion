package hoja2;

public class Ejer15 {

	public static void main(String[] args) {

		String[][] articulos = { { "Tablet Samsung", "120" }, { "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };

		int posMin = 0;
		int posMax = 0;

		System.out.println("Artículos\n===============================");

		for (int fila = 0; fila < articulos.length; fila++) {

			for (int col = 0; col < articulos[0].length; col++) {

				System.out.print(articulos[fila][col] + "\t");

			}

			System.out.println();

		}

		int total = 0;

		for (int fila = 0; fila < articulos.length; fila++) {

			total = total + Integer.parseInt(articulos[fila][1]);

			if (Integer.parseInt(articulos[fila][1]) < Integer.parseInt(articulos[posMin][1])) {

				posMin = fila;

			} else if (Integer.parseInt(articulos[fila][1]) > Integer.parseInt(articulos[posMax][1])) {

				posMax = fila;

			}

		}

		System.out.println("Total: " + total + "€\n");
		System.out.println("Precio mínimo: " + articulos[posMin][1] + "€");
		System.out.println("Precio máximo: " + articulos[posMax][1] + "€");

	}

}