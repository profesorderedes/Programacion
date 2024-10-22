import java.util.Scanner;

public class Ejemplo15 {

	public static void main(String[] args) {

		// Programa que pregunte un nombre y si lo que se escribe
		// no es "Francisco", vuelva a preguntar. Y así, indefinidamente.

		Scanner entrada = new Scanner(System.in);

		String nombre;

		do {
			System.out.print("¿Cómo te llamas? ");
			nombre = entrada.nextLine();
		} while (!nombre.equals("Francisco"));

		System.out.println("Hola, Francisco.");

	}
}
