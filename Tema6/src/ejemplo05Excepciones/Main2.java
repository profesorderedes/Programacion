package ejemplo05Excepciones;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº");
		System.out.println("Escribe un nº entero: ");
		String numero = entrada.nextLine();

		try {

			int num = Integer.parseInt(numero);
			System.out.println("La división de 20 entre " + num + " es " + 20 / num);

		} catch (NumberFormatException nfe) {

			System.out.println("No se puede hacer la división. Tenías que escribir un número entero.");

		} catch (ArithmeticException ae) {

			System.out.println("No se puede dividir entre cero.");

		} catch (Exception e) {

			System.out.println("Error. No se ha podido hacer la división.");

		}

		System.out.println("Fin");

	}

}
