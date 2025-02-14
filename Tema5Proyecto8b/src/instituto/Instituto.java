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

	// Ejercicio: modifica este método de acuerdo a lo explicado
	// en clase.
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

	// Ejercicio: modifica este método de acuerdo a lo explicado
	// en clase.
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
