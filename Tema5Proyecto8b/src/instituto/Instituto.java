package instituto;

import auxiliar.Alumno;

public class Instituto {

	private final int MAX_ALUMNOS = 1000;

	private Alumno[] alumnos = new Alumno[MAX_ALUMNOS];

	// Posición donde se va a guardar el próximo alumno
	// que añadamos al array.
	private int posSiguienteAlumno = 0;

	public void addAlumno(Alumno alu) {

		// Si el array está lleno, no se puede añadir al alumno.
		if (posSiguienteAlumno == alumnos.length) {
			System.out.println("Lista llena.");
			return;
		}

		// Guardamos al alumno en la posición designada.
		alumnos[posSiguienteAlumno] = alu;

		// Actualizamos posSiguienteAlumno.
		posSiguienteAlumno++;

	}

	public void muestraAlumnos() {

		System.out.println("Listado de alumnos matriculados:\n=========================");

		for (int i = 0; i < posSiguienteAlumno; i++) {
			System.out.println(alumnos[i]);
		}

	}

	public void delAlumno(int numExp) {

		// Averiguamos en qué posición del array se encuentra
		// el alumno con número de expediente numExp.
		int pos = buscaAlumno(numExp);

		// Subimos una posición a todos los alumnos por debajo del que
		// queremos eliminar.
		if (pos != -1) {
			subirAlumnos(pos);
			posSiguienteAlumno--;
		}

	}

	public int numAlumnos() {

		return posSiguienteAlumno;

	}

	// Ejercicio: adaptar este método a la nueva manera de gestionar el array.
	public int buscaAlumno(int numExp) {

		for (int i = 0; i < posSiguienteAlumno; i++) {
			if (numExp == alumnos[i].getNumExpediente()) {
				return i;
			}
		}

		return -1;

	}

	// Sube cada alumno una posición en el array. Desde la posición pos.
	// Usaremos este método en delAlumno().
	public void subirAlumnos(int pos) {

		for (int i = pos; i < posSiguienteAlumno - 1; i++) {

			alumnos[i] = alumnos[i + 1];

		}

	}

}
