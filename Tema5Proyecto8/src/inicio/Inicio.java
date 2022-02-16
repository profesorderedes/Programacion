package inicio;

import auxiliar.Grupo;

public class Inicio {

	public static void main(String[] args) {

		Grupo g1 = new Grupo(5, "ESO", 2, "A");

//		System.out.println(g1.toString());

		Grupo g2 = new Grupo();
		g2.leeDatos();
		System.out.println(g2.toString());

	}

}
