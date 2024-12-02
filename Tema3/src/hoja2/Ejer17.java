package hoja2;

public class Ejer17 {

	public static void main(String[] args) {

		String[][] alumnos = { { "Jose Luis Martínez", "7" }, { "Antonia Ruiz", "9" }, { "Marcos Ramírez", "10" },
				{ "Juana Herranz", "4" }, { "Alberto López ", "7" } };

		double total = 0;
		int posMin = 0;

		for (int i = 0; i < alumnos.length; i++) {

			total = total + Double.parseDouble(alumnos[i][1]);

			if (Integer.parseInt(alumnos[i][1]) < Integer.parseInt(alumnos[posMin][1])) {

				posMin = i;

			}

		}

		double media = total / alumnos.length;

		System.out.println("Media notas: " + media + "\n");
		System.out.println(alumnos[posMin][0] + " tiene la nota más baja: un " + alumnos[posMin][1]);

	}

}