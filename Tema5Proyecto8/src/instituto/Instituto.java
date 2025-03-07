package instituto;

import auxiliar.Alumno;

public class Instituto {

	private final int MAX_ALUMNOS = 1000;

	private Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
	
	public void addAlumno(Alumno alu) {

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alu;
				break;
			}
		}

	}

	public void muestraAlumnos() {

		System.out.println("Listado de alumnos matriculados");
		System.out.println("==========================================");

		for (int i = 0; i < alumnos.length; i++) {

			if (alumnos[i] != null) {
				System.out.println(alumnos[i] + "\n");
			}

		}

	}

	public void delAlumno(int numExp) {

		// Averiguamos en qué posición del array se encuentra
		// el alumno con número de expediente numExp.
		int pos = buscaAlumno(numExp);

		// Vaciamos la posición del array donde se encuentra el alumno.
		if (pos != -1) {
			alumnos[pos] = null;
		}

	}

	public int numAlumnos() {

		int matriculados = 0;

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				matriculados++;
			}
		}

		return matriculados;

	}

	public int buscaAlumno(int numExp) {

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && numExp == alumnos[i].getNumExpediente()) {
				return i;
			}
		}

		return -1;

	}

}
