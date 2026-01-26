package instituto;

import auxiliar.Alumno;

public class Instituto {

	// El instituto puede contener hasta mil alumnos.
	private final int MAX_ALUMNOS = 10;
	private Alumno[] alumnos;
	private int fin;

	public Instituto() {
		alumnos = new Alumno[MAX_ALUMNOS];
		fin = 0;
	}

	public void addAlumno(Alumno alu) {

		if (fin < alumnos.length) {
			alumnos[fin] = alu;
			fin++;
		} else {
			System.out.println("No hay espacio en el array.");
		}

	}

	public void mostrarAlumnos() {

		System.out.println("\nListado de alumnos");
		System.out.println("==================");
		for (int i = 0; i < fin; i++) {
			System.out.println(alumnos[i].toString());
		}

	}

	public void delAlumno(int numExp) {

		// Posición en el array del alumno cuyo número
		// de expediente es numExp.
		int pos = buscaAlumno(numExp);

		if (pos == -1) {
			System.out.println("No hay ningún alumno con este expediente.");
			return;
		}

		// Subimos los alumnos que hubiera por debajo de esa posición,
		// un lugar hacia arriba.

		for (int i = pos; i <= fin - 2; i++) {
			alumnos[i] = alumnos[i + 1];
		}

		fin--;

	}

	public int numAlumnos() {

		return fin;

	}

	public int buscaAlumno(int numExp) {

		for (int i = 0; i < fin; i++) {

			if (alumnos[i].getNumExpediente() == numExp) {
				return i;
			}

		}

		return -1;

	}

}
