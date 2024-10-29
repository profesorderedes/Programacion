
public class Ejemplo21 {

	public static void main(String[] args) {

		// Programa que muestre todos los números del 1 al 20.

		for (int i = 1; i <= 20; i++) {

			if (i % 5 == 0) {
				// Nos saltamos el escribir el número.
				// continue hace que en esta pasada el bucle se salte
				// las intrucciones que quedan por debajo.
				continue;
			}

			System.out.println(i);
		}

	}

}
