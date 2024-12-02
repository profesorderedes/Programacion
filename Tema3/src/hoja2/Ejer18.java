package hoja2;

public class Ejer18 {

	public static void main(String[] args) {

		String[][] notas = { { "Jose Luis Martínez", "7" }, { "Antonia Ruiz", "9" }, { "Marcos Ramírez", "10" },
				{ "Juana Herranz", "4" }, { "Alberto López", "7" } };

		double total = 0;

		for (int fila = 0; fila < notas.length; fila++) {

			total = total + Integer.parseInt(notas[fila][1]);

			for (int col = 0; col < notas[0].length; col++) {
				System.out.print(notas[fila][col] + "\t");
			}

			System.out.println();

		}

		double media = total / notas.length;

		int posMin = 0;
		int posMax = 0;

		for (int fila = 1; fila < notas.length; fila++) {

			if (Integer.parseInt(notas[fila][1]) < Integer.parseInt(notas[posMin][1])) {

				posMin = fila;

			} else if (Integer.parseInt(notas[fila][1]) > Integer.parseInt(notas[posMax][1])) {

				posMax = fila;

			}

		}

		System.out.println("\nLa nota media es de: " + media);
		System.out.println(notas[posMin][0] + " tiene la nota más baja, es un " + notas[posMin][1]);
		System.out.println(notas[posMax][0] + " tiene la nota más alta, es un " + notas[posMax][1]);

	}

}