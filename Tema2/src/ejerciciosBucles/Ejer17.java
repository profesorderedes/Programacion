package ejerciciosBucles;

public class Ejer17 {

	public static void main(String[] args) {

		// La variable i indica la tabla de multiplicar que
		// se va a generar.
		for (int i = 1; i <= 10; i++) {

			// Hacer un bucle de 1 a 10 que muestre la tabla
			// del número i
			System.out.println("\nTabla del " + i);
			System.out.println("=================");

			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}

		}

	}

}
