package ejemplosArrays;

public class Ejemplo16FormatearTablas {

	public static void main(String[] args) {

		String[][] personal = { { "Pedro Herrero", "971001122", "07001" },
				{ "María Sánchez Mas", "971555555", "07009" }, { "Juan Martínez Jiménez", "971222200", "07005" },
				{ "Paula López", "971110066", "07002" }, };

		System.out.printf("%-26s %12s  %8s\n", "Nombre", "Número", "Código P");
		System.out.printf("%-26s %12s  %8s\n", "======================", "============", "========");

		for (int fila = 0; fila < personal.length; fila++) {
			System.out.printf("%-26s %12s  %8s\n", personal[fila][0], personal[fila][1], personal[fila][2]);
		}
	}

}