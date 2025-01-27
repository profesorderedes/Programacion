package miscelanea;

public class MostrarTablas {

	public static void main(String[] args) {

		String nombre = "Carlos";
		String apellidos = "Fernández";
		double sueldo = 1700;

		System.out.printf("%s %s, con sueldo %f\n", nombre, apellidos, sueldo);
		System.out.printf("%s, %s, con sueldo %.2f\n", apellidos, nombre, sueldo);
		System.out.printf("%-12s, %-15s, con sueldo %10.2f\n", apellidos, nombre, sueldo);

	}

}
