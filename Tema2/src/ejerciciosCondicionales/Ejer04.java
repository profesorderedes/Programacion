package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Contraseña:  ");
		String nombre = entrada.nextLine();

		if (nombre.equals("1234")) { // Aqui pondriamos nombre == "Pablo", pero como es un String usamos el
										// nombre.equals("Pablo")
			System.out.println("Acceso concedido");
		}

	}

}