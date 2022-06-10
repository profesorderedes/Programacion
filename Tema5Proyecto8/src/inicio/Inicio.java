package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {

		Grupo g1 = new Grupo(5, "ESO", 2, "A");

//		System.out.println(g1.toString());

//		Grupo g2 = new Grupo();
//		g2.leeDatos();
//		System.out.println(g2.toString());

		Alumno alumno1 = new Alumno(10, "López Ramírez", "Ana", g1);
//		System.out.println(alumno1.toString());

		Alumno alumno2 = new Alumno();
//		alumno2.leeDatos();
//		System.out.println("\n" + alumno2.toString());

		Instituto instituto = new Instituto();

		// Añadimos algunos alumnos ya creado.

		instituto.addAlumno(alumno1);

		Alumno alumno3 = new Alumno(11, "Mas Rodríguez", "Marcos", g1);
		Alumno alumno4 = new Alumno(12, "Sánchez López", "María", g1);

		instituto.addAlumno(alumno3);
		instituto.addAlumno(alumno4);

		instituto.muestraAlumnos();
		System.out.println("\nHay " + instituto.numAlumnos() + " alumnos en el instituto.");

		instituto.delAlumno(11);
		instituto.muestraAlumnos();

		System.out.println("\nHay " + instituto.numAlumnos() + " alumnos en el instituto.");

		Alumno alumno5 = new Alumno(13, "Sanchís Sánchez", "Juan", g1);
		instituto.addAlumno(alumno5);
		instituto.muestraAlumnos();

		System.out.println("\nHay " + instituto.numAlumnos() + " alumnos en el instituto.");

		System.out.println("El alumno con expediente 10 está " + "en la posición " + instituto.buscaAlumno(10) + ".");

		System.out.println("El alumno con expediente 30 está " + "en la posición " + instituto.buscaAlumno(30) + ".");

	}

}
