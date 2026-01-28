package instituto;

import auxiliar.Alumno;
import auxiliar.Grupo;

public class Instituto {

	private Alumno[] alumnos;
	private int fin;

	public Instituto(int maxAlumnos) {

		// Inicializamos el array alumnos con la cantidad que nos pasan como parámetro.
		alumnos = new Alumno[maxAlumnos];
		fin = 0;
	}

	// Firma: addAlumno(Alumno)
	public boolean addAlumno(Alumno alu) {

		if (fin < alumnos.length) {
			alumnos[fin] = alu;
			fin++;
			return true;
		}

		return false;

	}

	// Firma: addAlumno(int, String, String, Grupo)
	public boolean addAlumno(int numExpediente, String apellidos, String nombre, Grupo grupo) {

		return addAlumno(new Alumno(numExpediente, apellidos, nombre, grupo));

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
			return false;
		}

		// Subimos los alumnos que hubiera por debajo de esa posición,
		// un lugar hacia arriba.

		for (int i = pos; i <= fin - 2; i++) {
			alumnos[i] = alumnos[i + 1];
		}

		fin--;

		return true;

	}

	/**
	 * Borra todos los alumnos del instituto.
	 */
	public void delAlumnos() {
		fin = 0;
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

	public void mostrarAlumnosPorNivel(String nivel) {

		System.out.println("\nListado de alumnos de " + nivel);
		System.out.println("=========================================");

		for (int i = 0; i < fin; i++) {
			if (alumnos[i].getGrupo() != null && alumnos[i].getGrupo().getNivel().equals(nivel)) {
				System.out.println(alumnos[i].toString());
			}
		}

	}

	public void mostrarAlumnosPorGrupo(String nivel, int curso, String clase) {

		System.out.println("\nListado de alumnos de " + curso + "º de " + nivel + " " + clase);
		System.out.println("===============================================================");

		for (int i = 0; i < fin; i++) {
			if (alumnos[i].getGrupo() != null && alumnos[i].getGrupo().getNivel().equals(nivel)
					&& alumnos[i].getGrupo().getCurso() == curso && alumnos[i].getGrupo().getClase().equals(clase)) {

				System.out.println(alumnos[i].toString());

			}
		}

	}

	/**
	 * Muestra una lista con los grupos de los alumnos.
	 */
	public void mostrarGrupos() {

		System.out.println("\nListado de grupos del instituto");
		System.out.println("===============================================================");

		String gruposId = "";

		for (int i = 0; i < fin; i++) {

			if (alumnos[i].getGrupo() != null) {

				int idGrupo = alumnos[i].getGrupo().getId();

				if (!gruposId.contains("," + idGrupo)) {
					System.out.println("- " + alumnos[i].getGrupo().toString());
					gruposId = gruposId + "," + idGrupo;
				}
			}

		}

	}

	/**
	 * Borra todos los alumnos con número de expediente 0.
	 * 
	 * @return True si se ha borrado a alguien y false en caso contrario.
	 */
	public boolean delAlumnosEnBlanco() {

		boolean alumnoBorrado = false;

		for (int i = 0; i < fin; i++) {
			if (alumnos[i].getNumExpediente() == 0) {
				delAlumno(alumnos[i].getNumExpediente());
				alumnoBorrado = true;
			}
		}

		return alumnoBorrado;
	}

	/**
	 * Devuelve el número de alumnos que hay en el grupo cuyo id es idGrupo.
	 * 
	 * @param idGrupo Identificador del grupo
	 * @return Número de alumnos presentes en ese grupo.
	 */
	public int numAlumnos(int idGrupo) {

		int numAlumnos = 0;
		for (int i = 0; i < fin; i++) {
			if (alumnos[i].getGrupo() != null && alumnos[i].getGrupo().getId() == idGrupo) {
				numAlumnos++;
			}
		}

		return numAlumnos;

	}

}
