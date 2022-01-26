import java.util.Scanner;

public class Ejemplo08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número entero:");
		int num = entrada.nextInt();

		System.out.println("El doble de " + num + " es " 
				+ duplicar(num));

	}

	// Método que recibe un parámetro entero
	// y devuelve el doble.
	static int duplicar(int numero) {

		return numero * 2;

	}
}
