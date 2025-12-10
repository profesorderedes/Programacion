package ejemplosArrays;

public class Ejemplo15FormatearTablas {

	public static void main(String[] args) {

		// @formatter:off
		String[][] alumnos = { 
				{ "Jose Francisco Rodríguez", "7",  "1º DAW" }, 
				{ "Antonia Ruiz",             "9",  "1º Bachillerato A" }, 
				{ "Marcos Ramírez",           "10", "3º ESO C" },
				{ "Juana Herranz",            "4",  "1º DAW" }, 
				{ "Alberto López",            "7",  "2º Bachillerato B" } 
		};
		// @formatter:on

		System.out.printf("%-26s %4s   %-19s\n", "Nombre", "Nota", "Curso");
		System.out.printf("%-26s %4s   %-19s\n", "==========================", "====", "===================");
		
		for (int fila = 0; fila < alumnos.length; fila++) {
			System.out.printf("%-26s %4s   %-19s\n", alumnos[fila][0], alumnos[fila][1], alumnos[fila][2]);
		}

	}

}
