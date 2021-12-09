package ejercicios1;

public class Ejer15 {

	public static void main(String[] args) {

		double temperaturas[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		double total = 0;

		for (int i = 0; i < temperaturas.length; i++) {

			total = total + temperaturas[i];

		}

		double media = total / temperaturas.length;

		System.out.println("La media de las temperaturas es de " + media + "ºC.");

	}

}
