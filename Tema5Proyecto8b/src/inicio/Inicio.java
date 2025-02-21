package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {

		Grupo g1 = new Grupo(1000, "ESO", 4, "A");

		Alumno a1 = new Alumno(500, "Sánchez", "Manuel", g1);
		Alumno a2 = new Alumno(501, "Mas", "Carlos", g1);
		Alumno a3 = new Alumno(502, "Martínez", "Rubén", g1);

		Instituto insti = new Instituto();

		insti.addAlumno(a1);
		insti.addAlumno(a2);
		insti.addAlumno(a3);

		insti.muestraAlumnos();
		System.out.println("Hay " + insti.numAlumnos() + " alumnos matriculados.");

//		System.out.println("\nSubiendo alumnos desde la posición 0:");
//		insti.subirAlumnos(0);
//		insti.muestraAlumnos();

//		System.out.println();
//		insti.delAlumno(502);
//		insti.muestraAlumnos();
//		System.out.println();
//		
//		insti.delAlumno(500);
//		insti.muestraAlumnos();
//		System.out.println();
//		
//		insti.delAlumno(501);
//		insti.muestraAlumnos();

		System.out.println("Hay " + insti.numAlumnos() + " alumnos matriculados.");

		System.out
				.println("El alumno con número de expediente 300 está en la posición " + insti.buscaAlumno(300) + ".");
		System.out
				.println("El alumno con número de expediente 501 está en la posición " + insti.buscaAlumno(501) + ".");

	}

}
