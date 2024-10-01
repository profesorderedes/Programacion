
import java.util.Scanner;

public class Ejemplo17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Qué edad tienes?");
		int edad = entrada.nextInt();

		System.out.println("No parece que tengas " + edad + " años.");

		// Vaciamos el buffer de entrada porque si no, se salta la pregunta
		// siguiente.
		entrada.nextLine();

		System.out.println("\n¿Cómo te llamas?");
		String nombre = entrada.nextLine();

		System.out.println("Encantado de conocerte, " + nombre + ".");

		System.out.println("\n¿Qué estás estudiando?");
		String estudiando = entrada.nextLine();

		System.out.println("Estudiar " + estudiando + " debe ser fascinante.");

	}

}
