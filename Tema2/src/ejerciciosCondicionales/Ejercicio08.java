package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cómo se dice ordenador en inglés?");
		String nombre = entrada.nextLine();

		if (nombre.equals("computer")) {
			System.out.println(" Has acertado");
		} else {
			System.out.println("Vuelve a intentarlo");
		}
	}
}