import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número entero:");
		int num = entrada.nextInt();

		duplicar(num);

	}

	// Método que recibe un parámetro entero
	// y mostrará el doble.
	static void duplicar(int numero) {

		System.out.println(numero * 2);

	}
}
