package ejemplo15Consola;

import utilidades.Consola;

public class PruebasConsola {

	public static void main(String[] args) {

		System.out.println("Escribe tu edad:");
		int edad = Consola.leerInt();

		System.out.println("Tienes " + edad + " años.");

	}

}
