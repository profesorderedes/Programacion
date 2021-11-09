
import java.util.Scanner;

public class Ejemplo18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¡¡A ver si adivinas el número " + "entre 1 y 10!!");

		int num;
		do {

			System.out.println("Número? ");
			num = entrada.nextInt();

		} while (num != 7);

		System.out.println("Has acertado el número. ¡¡Era el 7!!");

	}
}
