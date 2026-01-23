package instituto;

import auxiliar.Alumno;

public class Instituto {

	private Alumno[] alumnos;
	private int fin;

	public Instituto(int maxAlumnos) {

		// Inicializamos el array alumnos con la cantidad que nos pasan como parámetro.
		alumnos = new Alumno[maxAlumnos];
		fin = 0;
	}

	public boolean addAlumno(Alumno alu) {

		if (fin < alumnos.length) {
			alumnos[fin] = alu;
			fin++;
			return true;
		}

		return false;

	}

	public void mostrarAlumnos() {

		System.out.println("\nListado de alumnos");
		System.out.println("==================");
		for (int i = 0; i < fin; i++) {
			System.out.println(alumnos[i].toString());
		}

	}

	public boolean delAlumno(int numExp) {

		// Posición en el array del alumno cuyo número
		// de expediente es numExp.
		int pos = -1;

		// Encontramos la posición del alumno con ese número de expediente.
		for (int i = 0; i < fin; i++) {
			if (alumnos[i].getNumExpediente() == numExp) {
				pos = i;
				break;
			}
		}

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

		int pos = -1;

		for (int alumno = 0; alumno < fin; alumno++) {

			if (alumnos[alumno].getNumExpediente() == numExp) {
				pos = alumno;
			}

		}

		return pos;

	}

}
