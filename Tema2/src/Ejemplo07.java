import java.util.Scanner;

public class Ejemplo07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// En un teatro tienen entradas de tres tipos: 1, 2 y 3, según el tipo, las
		// entradas tienen distintos valores.

		System.out.println("¿Qué tipo de entrada tienes?");
		int tipo = entrada.nextInt();

		switch (tipo) {
		case 1:
			System.out.println("Tienes la entrada estandar.");
			break;

		case 2:
			System.out.println("Tienes la entrada pro.");
			break;

		case 3:
			System.out.println("Tienes la entrada premium.");
			break;

		default:
			System.out.println("Ese tipo de entrada no existe.");

		}

	}

}
