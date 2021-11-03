
import java.util.Scanner;

public class Ejemplo14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce año: ");
		int anyo = entrada.nextInt();

		if (entrada.hasNextInt() == true) {
			System.out.println("El año que has escrito es " + anyo);
		} else {
			System.out.println("No has introducido un año correcto.");
		}

	}

}
