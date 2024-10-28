import java.util.Scanner;

public class Ejemplo19 {

	public static void main(String[] args) {

		// Bucles anidados.

		Scanner entrada = new Scanner(System.in);

		// Bucle exterior: repetir tres veces.
		for (int i = 1; i <= 3; i++) {

			System.out.print("Número de repeticiones: ");
			int repeticiones = entrada.nextInt();

			// Bucle interior: repetir una palabra tantas veces
			// como indica la variable repeticiones.
			for (int j = 1; j <= repeticiones; j++) {
				System.out.println("hola");
			}

		}

	}

}
