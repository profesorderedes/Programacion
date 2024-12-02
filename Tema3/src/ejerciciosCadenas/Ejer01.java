package ejerciciosCadenas;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe tu palabra favorita:");
		String palabra = entrada.nextLine();

		System.out.println("Tu palabra favorita tiene " + palabra.length() + " letras.");

	}
}
