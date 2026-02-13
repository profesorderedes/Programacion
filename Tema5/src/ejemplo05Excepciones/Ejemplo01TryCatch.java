package ejemplo05Excepciones;

import java.util.Scanner;

public class Ejemplo01TryCatch {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº");
		System.out.println("Escribe un nº entero: ");
		String numero = entrada.nextLine();

		try {

			int num = Integer.parseInt(numero);
			System.out.println("La división de 20 entre " + num + " es " + 20 / num);

		} catch (NumberFormatException e) {

			System.out.println("No se ha podido convertir a número entero.");

		} catch (ArithmeticException e) {

			System.out.println("No se puede dividir por cero.");

		} catch (Exception e) {

			System.out.println("Se ha producido un error y la aplicación se cerrará.");

		}

	}

}
