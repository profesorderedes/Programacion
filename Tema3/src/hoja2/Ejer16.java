package hoja2;

public class Ejer16 {

	public static void main(String[] args) {

		String[][] notas = { { "Jose Luis Martinez", "7" }, { "Antonia Ruiz", "9" }, { "Marcos Ramirez", "10" },
				{ "Juana Hernandez", "4" }, { "Alberto lópez", "7" } };

		double total = 0;

		for (int fila = 0; fila < notas.length; fila++) {

			for (int col = 0; col < notas[0].length; col++) {
				System.out.print(notas[fila][col] + "\t");
			}

			System.out.println("");
			total = total + Double.parseDouble(notas[fila][1]);

		}

		double media = total / notas.length;
		System.out.println("\nLa media del curso es: " + media);

	}

}
