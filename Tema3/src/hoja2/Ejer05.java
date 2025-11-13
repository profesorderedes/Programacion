package hoja2;

public class Ejer05 {

	public static void main(String[] args) {

		double[] temperaturas = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		int posMin = 0, posMax = 0;

		for (int i = 1; i < temperaturas.length; i++) {

			if (temperaturas[i] < temperaturas[posMin]) {
				posMin = i;
			} else if (temperaturas[i] > temperaturas[posMax]) {
				posMax = i;
			}

		}

		System.out.println("La temperatura mínima es de " + temperaturas[posMin] + "ºC.");
		System.out.println("En la posición " + posMin + ".");

		System.out.println();

		System.out.println("La temperatura máxima es de " + temperaturas[posMax] + "ºC.");
		System.out.println("En la posicion " + posMax + ".");

	}

}
