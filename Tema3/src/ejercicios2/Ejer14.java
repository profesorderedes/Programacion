package ejercicios2;

public class Ejer14 {

	public static void main(String[] args) {

		String precios[][] = { { "Tablet Samsung", "120" }, { "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };

		System.out.println("La tabla tiene:");
		System.out.println("\t- " + precios.length + " filas");
		System.out.println("\t- " + precios[0].length + " columnas");

		// Recorremos cada fila de la tabla.
		System.out.println("\nArtículos");
		System.out.println("=========");
		for (int fila = 0; fila < precios.length; fila++) {

			// Recorremos cada columna de la tabla.
			for (int col = 0; col < precios[0].length; col++) {
				System.out.print(precios[fila][col] + "\t");
			}

			System.out.println();

		}

		// Sumamos todos los precios.
		float total = 0;
//		float precio;
		for (int fila = 0; fila < precios.length; fila++) {

//			precio = Float.parseFloat(precios[fila][1]);
//			total = total + precio;
			total = total + Float.parseFloat(precios[fila][1]);

		}

		System.out.println("\nEl total de artículos cuesta " + total + " euros.");

	}

}
