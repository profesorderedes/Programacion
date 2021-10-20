
import java.util.Scanner;

public class Ejemplo16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Qué edad tienes?");
		int edad = entrada.nextInt();

		// Lee todo lo que hubiera en el buffer de entrada
		// y lo deja vacío.
		entrada.nextLine();

		System.out.println("¿Qué tipo de entrada quieres?");
		String tipo = entrada.nextLine();

		System.out.println("¿Cuál es tu nombre completo?");
		String nombre = entrada.nextLine();

	}

}
