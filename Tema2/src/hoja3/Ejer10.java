package hoja3;

public class Ejer10 {

	public static void main(String[] args) {

// 10.- Escribe un programa que vaya escribiendo los números impares del 3 al 299. Cada vez que uno
// de esos números sea divisible por 5 aparecerá además la frase "Divisible por 5". Utiliza un bucle
// while.

		int numero = 3;

		while (numero <= 299) {

			if (numero % 5 == 0) {

				System.out.println(numero + ">>> Es divisible por 5");

			} else {

				System.out.println(numero);

			}

			numero = numero + 2;

		}

	}

}