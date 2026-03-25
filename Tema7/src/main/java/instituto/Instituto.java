package instituto;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

	private List<Alumno> alumnos;

	public Instituto() {
		alumnos = new ArrayList<>();
	}

	public void addAlumno(Alumno alu) {

		alumnos.add(alu);

	}

	public void mostrarAlumnos() {

		System.out.println("\nListado de alumnos");
		System.out.println("==================");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.toString());
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

		alumnos.remove(pos);

	}

	public int numAlumnos() {

		return alumnos.size();

	}

	public int buscaAlumno(int numExp) {

		for (int i = 0; i < alumnos.size(); i++) {

			if (alumnos.get(i).getNumExpediente() == numExp) {
				return i;
			}

		}

		return -1;

	}

}
