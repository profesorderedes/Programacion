package ejercicios2;

public class Ejer12b {

	public static void main(String[] args) {

		int numeros[] = { 8, 2, 10, 20, 12, 71, 15, 23 };
		int posMax;
		int aux;

		for (int i = 0; i < numeros.length - 1; i++) {

			posMax = i;

			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[j] > numeros[posMax]) {
					posMax = j;
				}

			}

			aux = numeros[posMax];
			numeros[posMax] = numeros[i];
			numeros[i] = aux;

		}

		System.out.println("Los números atómicos ordenados de mayor a menor:"
				+ "\n==========================================" + "======");

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		System.out.println("\nEl número atómico más pequeño es " + numeros[numeros.length - 1] + " y el más grande es "
				+ numeros[0]);

	}

}