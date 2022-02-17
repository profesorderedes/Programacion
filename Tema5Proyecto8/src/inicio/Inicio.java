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
		
		Alumno alumno1 = new Alumno(10,"López Ramírez","Ana",
				g1);
//		System.out.println(alumno1.toString());
				
		Alumno alumno2 = new Alumno();
//		alumno2.leeDatos();
//		System.out.println("\n" + alumno2.toString());
		
		Instituto instituto = new Instituto();
		instituto.addAlumno(alumno1);
		
		

	}

}
