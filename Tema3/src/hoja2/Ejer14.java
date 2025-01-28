package hoja2;

public class Ejer14 {

	public static void main(String[] args) {

		String[][] precios = { { "Tablet Samsung", "120" }, { "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" }, };

		double total = 0;

		System.out.println("Artículos");
		System.out.println("=========");

		for (int fila = 0; fila < precios.length; fila++) {

			total = total + Integer.parseInt(precios[fila][1]);

			for (int col = 0; col < precios[0].length; col++) {

				System.out.print(precios[fila][col] + "\t");

			}

			System.out.println();

		}

		System.out.println("\nTotal: " + total);

	}

}