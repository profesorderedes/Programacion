package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {

		// Pruebas de la clase Grupo.

		Grupo grupo1 = new Grupo(1, "ESO", 3, "C");
//		System.out.println(grupo1.toString());

//		Grupo grupo2 = new Grupo();
//		grupo2.leeDatos();
//		System.out.println("\n" + grupo2.toString());

		// Pruebas de la clase Alumno.

		Alumno alu1 = new Alumno(100, "Sánchez López", "Mario", grupo1);
//		System.out.println(alu1.toString());

		Alumno alu2 = new Alumno();
//		alu2.leeDatos();
//		System.out.println("\n" + alu2.toString());
		
		// Pruebas de la clase Instituto.
		
		Instituto insti = new Instituto();
		
		Alumno alu3 = new Alumno(101, "Rodríguez Cobas", "Juana", grupo1);
		Alumno alu4 = new Alumno(102, "Mas García", "Francisco", grupo1);
		Alumno alu5 = new Alumno(103, "Garat Domínguez", "Rafael", grupo1);
		
		insti.addAlumno(alu1);
		insti.addAlumno(alu3);
		insti.addAlumno(alu4);
		insti.addAlumno(alu5);
		
		insti.mostrarAlumnos();
		
		insti.delAlumno(102);
		insti.mostrarAlumnos();
		
		
	}
}














