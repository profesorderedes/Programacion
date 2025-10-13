package ejemplos;

public class Ejemplo08While {

	public static void main(String[] args) {

		// Programa que muestre nuestro nombre cinco veces.
		int contador = 1;

		// El cuerpo del bucle se ejecutará si la condición entre paréntesis se cumple.
		while (contador <= 5) {

			System.out.println("Carlos");

			// Aumentamos contador en una unidad para que el bucle se acabe ejecutando
			// cinco veces.
			contador = contador + 1;

			// Al llegar al final del bucle, se vuelve hacia arriba y se comprueba si
			// la condición es cierta, y vuelta a empezar.
		}

		System.out.println("El programa continuaría...");

	}

}
