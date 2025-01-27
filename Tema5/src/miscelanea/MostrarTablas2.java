package miscelanea;

public class MostrarTablas2 {

	public static void main(String[] args) {

		String[][] empleados = { { "Manuel", "Pérez", "950" }, { "Marta", "López", "1900" },
				{ "Javier", "Sánchez", "1600" }, { "Nuria", "Martínez", "1650" }, { "Lucía", "Fernández", "1700" } };

		mostrarTabla(empleados);
	}

	static void mostrarTabla(String[][] tabla) {

		System.out.println("Empleados de la empresa\n");

		System.out.printf("%-8s %-11s %6s\n", "NOMBRE", "APELLIDOS", "SUELDO");
		System.out.printf("%-8s %-11s %6s\n", "======", "=========", "======");
		for (int fila = 0; fila < tabla.length; fila++) {
			System.out.printf("%-8s %-11s %6s\n", tabla[fila][0], tabla[fila][1], tabla[fila][2]);
		}

	}

}
