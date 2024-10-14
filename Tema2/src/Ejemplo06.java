import java.util.Scanner;

public class Ejemplo06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Color del semáforo: ");
		String color = entrada.nextLine();

		// Pasamos color a minúsculas, para que la salida no dependa
		// de cómo lo escriba el usuario.
		color = color.toLowerCase();

		// En función del valor de "color", se indicará una cosa
		// u otra.
		switch (color) {
		case "verde":
			System.out.println("Continúa circulando.");
			break;
		case "naranja":
			System.out.println("Detente si te da tiempo.");
			break;
		case "rojo":
			System.out.println("Párate.");
			break;
		default:
			System.out.println("Tienes que introducir un color válido.");
		}

	}

}
