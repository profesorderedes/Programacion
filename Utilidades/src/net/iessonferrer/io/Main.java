package net.iessonferrer.io;

public class Main {

	public static void main(String[] args) {

		System.out.println("Escribe tu nombre:");
		String nombre = Consola.leerString("Lo has escrito mal.");
		System.out.println("Te llamas " + nombre);

		System.out.println("Escribe tu nombre:");
		nombre = Consola.leerString("Lo has escrito mal.");
		System.out.println("Te llamas " + nombre);

	}

}
