package ejercicios1;

import java.util.Scanner;

public class Ejer04 {

	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_BLUE = "\u001B[34m";

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe tu nota: ");
		float nota = entrada.nextFloat();

		if (nota < 4) {
			System.out.println(nota + ANSI_RED);
		} else if (nota < 5) {
			System.out.println(nota + ANSI_GREEN);
		} else if (nota >= 5) {
			System.out.println(nota + ANSI_BLUE);
		}

	}

}