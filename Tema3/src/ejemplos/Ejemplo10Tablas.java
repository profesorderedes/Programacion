package ejemplos;

public class Ejemplo10Tablas {

	public static void main(String[] args) {

		// Declaramos un array bidimensional dando directamente sus valores:

		String[][] personal = { 
				{ "Pedro", "971001122", "07001" }, 
				{ "María", "971555555", "07009" },
				{ "Juan", "971222200", "07005" }, 
				{ "Paula", "971110066", "07002" } 
		};

		// Datos de la primera fila.
		System.out.println("Nombre: " + personal[0][0]);
		System.out.println("Teléfono: " + personal[0][1]);
		System.out.println("CP: " + personal[0][2]);

		System.out.println("El array tiene " + personal.length + " filas.");
		System.out.println("Y " + personal[0].length + " columnas.");

		// Mostrar toda la tabla.
		System.out.println("\nDatos del personal:");

		for (int fila = 0; fila < personal.length; fila++) {

			// Mostramos la fila i
			for (int col = 0; col < personal[0].length; col++) {
				System.out.print(personal[fila][col] + "\t");
			}
			System.out.println();

			// System.out.println(personal[i][0] + "\t" + personal[i][1] + "\t" +
			// personal[i][2]);
		}

	}

}
