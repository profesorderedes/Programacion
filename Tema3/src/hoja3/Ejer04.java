package hoja3;

public class Ejer04 {

	public static void main(String[] args) {

		double[] temperatura = { 3.2, 3.5, 7.2, 0.1, 1, -2.3, -5, 3.4, 4, 4, 4, 1.4, 2.5, -0.4, -3.6 };

		boolean tempNegativa = false;

		for (int i = 0; i < temperatura.length; i++) {

			if (temperatura[i] < 0) {

				System.out.println("La primera medida menor que cero esta en la posición " + i);

				tempNegativa = true;

				break;

			}

		}

		if (!tempNegativa) {

			System.out.println("-1");

		}

	}

}