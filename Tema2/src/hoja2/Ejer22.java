package hoja2;

public class Ejer22 {

	public static void main(String[] args) {

		// Bucle externo: repite 10 veces.
		for (int i = 1; i <= 10; i++) {

			System.out.println("\nTabla del " + i);

			// Bucle interior: muestra la tabla del nº i.
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}

		}

	}

}
