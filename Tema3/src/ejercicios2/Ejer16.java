package ejercicios2;

public class Ejer16 {

	public static void main(String[] args) {

		String calificaciones[][] = { { "Jose Luis Martinez", "7" }, { "Antonia Ruiz", "9" },
				{ "Marcos Ramirez", "10" }, { "Juana Herranz", "4" }, { "Alberto Lopez", "7" } };

		float total = 0;
		for (int fila = 0; fila 
				< calificaciones.length; fila++) {

			total = total + Float.parseFloat(calificaciones[fila][1]);

			System.out.println();

			for (int columna = 0; columna 
					< calificaciones[0].length; columna++) {

				System.out.print(calificaciones[fila][columna] + " ");
			}

		}
		System.out.println("\n");
		System.out.println("La nota media del curso " 
		+ total / calificaciones.length);

	}

}