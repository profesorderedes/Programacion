package hoja2;

public class Ejer15 {

	public static void main(String[] args) {

		String[][] precios = {

				{ "Tablet Samsung", "120" }, { "Móvil Sony", "115" }, { "Ipad Mini", "290" }, { "Móvil HTC", "95" }

		};

		System.out.println("Articulos");
		System.out.println("=======================");
		System.out.println();

		double total = 0;

		for (int i = 0; i < precios.length; i++) {

			total = total + Float.parseFloat(precios[i][1]);

			for (int j = 0; j < precios[0].length; j++) {
				System.out.print(precios[i][j] + "\t");
			}

			System.out.println("");

		}

		// Calculamos el precio menor y el mayor.
		int posMin = 0;
		int posMax = 0;
		for (int fila = 1; fila < precios.length; fila++) {
			if (Integer.parseInt(precios[fila][1]) < Integer.parseInt(precios[posMin][1])) {
				posMin = fila;
			} else if (Integer.parseInt(precios[fila][1]) > Integer.parseInt(precios[posMax][1])) {
				posMax = fila;
			}
		}

		System.out.println("\nPrecio total: " + total + "\n");
		System.out.println("Precio menor: " + precios[posMin][1] + ", artículo: " + precios[posMin][0]);
		System.out.println("Precio mayor: " + precios[posMax][1] + ", artículo: " + precios[posMax][0]);

	}

}