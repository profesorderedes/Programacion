package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {

		Grupo grupo1 = new Grupo(1, "ESO", 3, "C");
		Grupo grupo2 = new Grupo(2, "BACHILLERATO", 1, "A");

		Alumno alu1 = new Alumno(100, "Sánchez López", "Mario", grupo1);
		Alumno alu2 = new Alumno();

		Instituto insti = new Instituto(10);

		Alumno alu3 = new Alumno(101, "Rodríguez Cobas", "Juana", grupo1);
		Alumno alu4 = new Alumno(102, "Mas García", "Francisco", grupo1);
		Alumno alu5 = new Alumno(103, "Garat Domínguez", "Rafael", grupo2);

		insti.addAlumno(alu1);
		insti.addAlumno(alu2);
		insti.addAlumno(alu3);
		insti.addAlumno(alu4);
		insti.addAlumno(alu5);

		insti.mostrarGrupos();

	}
}
