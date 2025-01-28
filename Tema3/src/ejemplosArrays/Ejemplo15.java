package ejemplosArrays;

public class Ejemplo15 {

	public static void main(String[] args) {

		String[][] descuentos = { { "Libreta", "10" }, { "Bolígrafo", "0" }, { "Periódico", "15" },
				{ "Cartulina A3", "5" } };

		for (int fila = 0; fila < descuentos.length; fila++) {
			System.out.println(descuentos[fila][0] + "\t" + descuentos[fila][1]);
		}

		for (int fila = 0; fila < descuentos.length; fila++) {

			for (int col = 0; col < descuentos[0].length; col++) {
				System.out.print(descuentos[fila][col] + "\t");
			}
			System.out.println();

		}

	}

}
