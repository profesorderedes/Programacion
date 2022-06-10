package ejemplo10Excepciones;

import java.util.Scanner;

public class Division3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número y dividiré 20 " + "entre él");
		System.out.print("Número: ");

		String numero = entrada.nextLine();

		try {
			int num = Integer.parseInt(numero);

			System.out.println("\nLa división de 20 entre " + num + " da " + 20 / num);
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("¡Debes introducir un número " + "entero distinto de 0!");
		}

	}

}
