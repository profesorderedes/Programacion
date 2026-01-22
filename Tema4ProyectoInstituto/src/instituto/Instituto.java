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
		
		if(fin < alumnos.length) {
			alumnos[fin] = alu;
			fin++;
		}else {
			System.out.println("No hay espacio en el array.");
		}
		
	}
	
	public void mostrarAlumnos() {
		
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println();
		}
		
	}

}







