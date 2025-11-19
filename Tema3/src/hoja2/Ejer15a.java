package hoja2;

public class Ejer15a {

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

			System.out.println("\n");

		}

// Creamos un array int con los precios para poder manejar numeros fuera del string.

		int[] precios = new int[articulos.length];

		for (int i = 0; i < articulos.length; i++) {

			precios[i] = Integer.parseInt(articulos[i][1]);

		}

		int total = 0;

		for (int i = 0; i < precios.length; i++) {

			total = total + precios[i];

			if (precios[i] < precios[posMin]) {

				posMin = i;

			} else if (precios[i] > precios[posMin]) {

				posMax = i;

			}

		}

		System.out.println("Total: " + total + "€\n");
		System.out.println("Precio mínimo: " + precios[posMin] + "€");
		System.out.println("Precio máximo: " + precios[posMax] + "€");

	}

}