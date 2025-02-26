package miscelanea;

public class OrdenarArraysBidiminseionales2 {

	public static void main(String[] args) {

		String[][] notas = { { "Jose Luis Martínez", "7" }, { "Antonia Ruiz", "9" }, { "Marcos Ramírez", "10" },
				{ "Juana Herranz", "4" }, { "Alberto López", "7" } };

		int posMin = 0;
		String[] aux = new String[2];

		for (int i = 0; i < notas.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < notas.length; j++) {

				if (notas[j][0].compareTo(notas[posMin][0]) < 0) {
					posMin = j;
				}

			}

			aux = notas[posMin];
			notas[posMin] = notas[i];
			notas[i] = aux;

		}

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("%-20s %-5s\n", notas[i][0], notas[i][1]);
		}

		System.out.println();

	}

}