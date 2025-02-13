package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;

public class Inicio {

	public static void main(String[] args) {

		Grupo g1 = new Grupo(1000, "ESO", 4, "A");

		System.out.println(g1.toString() + "\n");

		Grupo g2 = new Grupo();
//		g2.leeDatos();

		System.out.println(g2.toString() + "\n");
		
		Alumno a1 = new Alumno(500, "Sánchez", "Manuel", g1);
		
		System.out.println("\n" + a1.toString());

	}

}
