package hoja2;

public class Ejer16 {

	public static void main(String[] args) {

		String[][] alumnos = { { "Jose Luis Martínez", "7" }, { "Antonia Ruiz", "9" }, { "Marcos Ramírez", "10" },
				{ "Juana Herranz", "4" }, { "Alberto López", "7" } };

		for (int i = 0; i < alumnos.length; i++) {

			for (int j = 0; j < alumnos[i].length; j++) {

				System.out.print(alumnos[i][j] + "\t");

			}
			System.out.println();

		}

		int total = 0;

		for (int fila = 0; fila < alumnos.length; fila++) {

			total = total + Integer.parseInt(alumnos[fila][1]);

		}

		System.out.println("Nota media: " + (double) total / alumnos.length);

	}

}