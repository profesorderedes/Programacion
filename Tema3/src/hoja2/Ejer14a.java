package hoja2;

public class Ejer14a {

	public static void main(String[] args) {

		String[][] articulos = {
				{ "Tablet Samsung", "120" },
				{ "Móvil Sony", "115" },
				{ "Ipad Mini", "290" },
				{ "Móvil HTC", "95" }
		};

		System.out.println("Artículos\n===============================");

		for (int fila = 0; fila < articulos.length; fila++) {

			for (int col = 0; col < articulos[0].length; col++) {

				System.out.print(articulos[fila][col] + "\t");

			}

			System.out.println();

		}

		

		int total = 0;

		// Usamos el array que sólo tiene precios para sumar todas las cantidades.
		
		for (int fila = 0; fila < articulos.length; fila++) {

			total = total + Integer.parseInt(articulos[fila][1]);

		}

		System.out.println("Total: " + total + "€");

	}

}