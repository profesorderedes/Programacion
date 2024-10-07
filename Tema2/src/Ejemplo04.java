import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("MÁQUINA DE REFRESCOS");
		System.out.println("El bote de Coca-Cola cuesta 1.40 €.");

		System.out.println("Introduce una cantidad:");
		float cantidad = entrada.nextFloat();

		if (cantidad >= 1.40) {
			System.out.println("Ahí tienes tu refresco.");
		} else {
			System.out.println("Te faltan " + (1.40 - cantidad) + " euros.");
		}

	}

}
