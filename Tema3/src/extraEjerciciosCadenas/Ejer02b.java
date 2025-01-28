package extraEjerciciosCadenas;

import java.util.Scanner;

public class Ejer02b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el archivo y su extensión");
		String respuesta = entrada.nextLine();

		int punto = respuesta.lastIndexOf(".");

		// El nombre del archivo es lo que va desde la posición 0 hasta
		// el último punto.
		System.out.print("Nombre :" + respuesta.substring(0, punto));

		// La extensión del archivo es lo que va desde el último punto hasta
		// el final.
		System.out.print("\nExtensión : " + respuesta.substring(punto + 1));

	}

}
