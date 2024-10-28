import java.util.Scanner;

public class Ejemplo20 {

	public static void main(String[] args) {

		// Programa que pide diez notas, pero si una nota leída es
		// -1, se entiende que no quedan notas para introducir.

		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {

			System.out.print("Nota: ");
			int nota = entrada.nextInt();

			if (nota == -1) {
				break;
			}
		}

		System.out.println("Se ha terminado de leer notas.");

	}

}
