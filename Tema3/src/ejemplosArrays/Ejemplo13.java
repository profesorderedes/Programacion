package ejemplosArrays;

public class Ejemplo13 {

	public static void main(String[] args) {

		String[][] descuentos = { { "Libreta", "10" }, { "Bolígrafo", "0" }, { "Periódico", "15" },
				{ "Cartulina A3", "5" } };

		// Descuento medio.
		double total = 0;
		for (int fila = 0; fila < descuentos.length; fila++) {

			total = total + Double.parseDouble(descuentos[fila][1]);

		}

		double media = total / descuentos.length;

		System.out.println("Descuento medio: " + media + ".");

	}

}
