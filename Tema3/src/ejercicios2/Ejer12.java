package ejercicios2;

public class Ejer12 {

	public static void main(String[] args) {

		int numeros[] = { 8, 2, 10, 20, 12, 71, 15, 23 };
		int posMin;
		int aux;

		for (int i = 0; i < numeros.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}

			}

			aux = numeros[posMin];
			numeros[posMin] = numeros[i];
			numeros[i] = aux;

		}

		System.out.println("Los números atómicos ordenados de menor " + "a mayor:\n==================================="
				+ "=============");

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		System.out.println("\nEl número atómico mas pequeño es " + numeros[0] + " y el más grande es "
				+ numeros[numeros.length - 1]);

	}

}