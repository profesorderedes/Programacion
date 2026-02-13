package ejemplo05Excepciones;

import java.util.Scanner;

public class Ejemplo03Finally {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº");
		System.out.println("Escribe un nº entero: ");
		String numero = entrada.nextLine();

		try {

			int num = Integer.parseInt(numero);
			System.out.println("La división de 20 entre " + num + " es " + 20 / num);

		} catch (NumberFormatException | ArithmeticException e) {

			System.out.println("Tiene que escribir un número entero distinto de cero.");
			return;

		} catch (Exception e) {

			System.out.println("Se ha producido un error y la aplicación se cerrará.");

		} finally {
			System.out.println("Esto se va a ejecutar sí o sí.");
		}

		System.out.println("El programa continúa...");

	}

}
