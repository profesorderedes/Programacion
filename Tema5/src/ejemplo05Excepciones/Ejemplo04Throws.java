package ejemplo05Excepciones;

import java.util.Scanner;

public class Ejemplo04Throws {

	public static void main(String[] args) {

		try {
			dividir();
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("Tiene que escribir un número entero distinto de cero.");
		}

	}

	public static void dividir() throws NumberFormatException, ArithmeticException {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº");
		System.out.println("Escribe un nº entero: ");
		String numero = entrada.nextLine();

		int num = Integer.parseInt(numero);
		System.out.println("La división de 20 entre " + num + " es " + 20 / num);

	}

}
