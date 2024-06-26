package hoja2;

public class Ejer15 {

	public static void main(String[] args) {

		String[][] precios = { { "Tablet Samsung", "120" }, { "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" }, };

		float precioTotal = 0;

		System.out.println("Producto\tPrecio");
		System.out.println("===========================");

		// Mostramos la tabla y calculamos la suma de los precios.

		for (int fila = 0; fila < precios.length; fila++) {

			System.out.println(precios[fila][0] + "\t" + Float.parseFloat(precios[fila][1]));

			precioTotal += Float.parseFloat(precios[fila][1]);

		}

		System.out.println("\nTotal: " + precioTotal + " €");

		// Calculamos el mínimo y máximo (se podría hacer dentro del
		// bucle anterior también).

		int posMin = 0;
		int posMax = 0;

		for (int fila = 0; fila < precios.length; fila++) {

			if (Float.parseFloat(precios[fila][1]) < Float.parseFloat(precios[posMin][1])) {
				posMin = fila;
			} else if (Float.parseFloat(precios[fila][1]) > Float.parseFloat(precios[posMax][1])) {
				posMax = fila;
			}

		}

		System.out.println("Artículo más barato: ");
		System.out.println("  * " + precios[posMin][0] + " (" + precios[posMin][1] + " €).");

		System.out.println("Artículo más caro: ");
		System.out.println("  * " + precios[posMax][0] + " (" + precios[posMax][1] + " €).");

	}

}