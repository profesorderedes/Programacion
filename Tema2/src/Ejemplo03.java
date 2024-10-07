import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Inserte su altura");
		int alturaCliente = entrada.nextInt();

		if (alturaCliente < 160) {
			System.out.println("Lo sentimos, no puedes montar en la atracción");
		}

		if (alturaCliente >= 160) {
			System.out.println("Puedes montar en la atracción");
		}

	}

}