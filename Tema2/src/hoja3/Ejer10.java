package hoja3;

public class Ejer10 {

	public static void main(String[] args) {

		// Iniciar un número en 3, que es el primer número impar dentro del rango.
		int numero = 3;

		// Bucle while para recorrer los números impares desde 3 hasta 299
		while (numero <= 299) {
			// Imprimir el número
			System.out.print("\n" + numero);

			// Comprobar si el número es divisible por 5
			if (numero % 5 == 0) {
				System.out.print(" - Divisible por 5");
			}

			// Incrementar el número de 2 en 2 para pasar al siguiente número impar
			numero += 2;
		}
	}
}