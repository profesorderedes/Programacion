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

//		for (int i = 0; i < alumnos.length; i++) {
//			// Antes de mirar el número de expediente del alumno en la
//			// posición alumnos[i], comprobamos que no haya un null.
//			if (alumnos[i] != null && numExp == alumnos[i].getNumExpediente()) {
//				alumnos[i] = null;
//				break;
//			}
//		}

		int pos = buscaAlumno(numExp);

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
