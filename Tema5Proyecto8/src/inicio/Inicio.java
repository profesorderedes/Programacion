package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {

		Grupo g1 = new Grupo(1000, "ESO", 4, "A");

//		System.out.println(g1.toString() + "\n");

		Grupo g2 = new Grupo();
//		g2.leeDatos();

//		System.out.println(g2.toString() + "\n");

		Alumno a1 = new Alumno(500, "Sánchez", "Manuel", g1);

//		System.out.println("\n" + a1.toString());

		Alumno a2 = new Alumno();

		System.out.println();
//		a2.leeDatos();

//		System.out.println(a2.toString());

		Alumno a3 = new Alumno(501, "Mas", "Carlos", g1);
		Alumno a4 = new Alumno(502, "Martínez", "Rubén", g1);

		Instituto insti = new Instituto();

		insti.addAlumno(a1);
		insti.addAlumno(a3);
		insti.addAlumno(a4);

		insti.muestraAlumnos();
		System.out.println("Hay " + insti.numAlumnos() + " alumnos matriculados.");

		insti.delAlumno(100);
		insti.delAlumno(500);
		insti.muestraAlumnos();
		insti.delAlumno(502);
		insti.muestraAlumnos();
		System.out.println("Hay " + insti.numAlumnos() + " alumnos matriculados.");

		System.out
				.println("El alumno con número de expediente 500 está en la posición " + insti.buscaAlumno(500) + ".");
		System.out
				.println("El alumno con número de expediente 501 está en la posición " + insti.buscaAlumno(501) + ".");

	}

}
