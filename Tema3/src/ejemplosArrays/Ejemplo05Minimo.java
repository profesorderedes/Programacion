package ejemplosArrays;

public class Ejemplo05Minimo {

	public static void main(String[] args) {

		int[] numeros = { 5, 4, 9, 3, 1, 10, 7, 0, 5 };
		int posMin = 0, posMax = 0;

		for (int i = 1; i < numeros.length; i++) {

			if (numeros[i] < numeros[posMin]) {

				posMin = i;

			} else if (numeros[i] > numeros[posMax]) {

				posMax = i;

			}

		}

		System.out.println("La posición donde se encuentra el mínimo es " + posMin + ".");
		System.out.println("El valor mínimo en el array es " + numeros[posMin] + ".");

		System.out.println("La posición donde se encuentra el máximo es " + posMax + ".");
		System.out.println("El valor máximo en el array es " + numeros[posMax] + ".");

	}

}
