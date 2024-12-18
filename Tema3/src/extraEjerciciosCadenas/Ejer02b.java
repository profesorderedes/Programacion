package extraEjerciciosCadenas;

import java.util.Scanner;

public class Ejer02b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el archivo y su exstensión");
		String respuesta = entrada.nextLine();

		int punto = respuesta.lastIndexOf(".");

		System.out.print("Nombre :" + respuesta.substring(0, punto));
		System.out.print("\nExtensión : " + respuesta.substring(punto + 1));

	}

}
