package examen;

public class Ejer2 {

	public static void main(String[] args) {

		String satelites[][] = { { "Himalia", "1904", "170" }, { "Europa", "1610", "3122" },
				{ "Amaltea", "1892", "167" }, { "Lisitea", "1938", "36" } };
		int posMin = 0;
		float diametroMedio = 0;

		// Mostramos los datos en forma de tabla.
		System.out.println("Satélites de Júpiter");
		System.out.println("=================================");
		for (int fila = 0; fila < satelites.length; fila++) {
			System.out.println(satelites[fila][0] + "\t" + satelites[fila][1] + "\t" + satelites[fila][2]);
		}

		// Buscamos el satélite descubierto hace más tiempo.
		for (int fila = 1; fila < satelites.length; fila++) {

			if (Float.parseFloat(satelites[fila][1]) < Float.parseFloat(satelites[posMin][1])) {
				posMin = fila;
			}

		}

		System.out.println("\nEl satélite más antiguo conocido es " + satelites[posMin][0] + " y tiene un diámetro de "
				+ satelites[posMin][2] + " km.");

		// Calculamos el diámetro medio de estos cuatro cuerpos.
		for (int fila = 0; fila < satelites.length; fila++) {

			diametroMedio = diametroMedio + Float.parseFloat(satelites[fila][2]);

		}

		diametroMedio = diametroMedio / satelites.length;

		System.out.println("\nEl diámetro medio de estos satélites es de " + diametroMedio + " km.");

	}

}