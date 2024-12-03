package ejerciciosCadenas;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe tu palabra favorita: ");
		String palabra = entrada.nextLine();

		if (palabra.length() >= 6 && palabra.length() <= 12) {
			System.out.println("Esta contraseña tiene " + palabra.length() + " letras (contando espacios).");
		} else {
			System.out.println("ERROR");
		}

	}

}