package ejercicios1;

public class Ejer16 {

	public static void main(String[] args) {

		double temperaturas[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		double total = 0;

		for (int i = 0; i < temperaturas.length; i++) {

			total = total + temperaturas[i];

		}

		double media = total / temperaturas.length;

		System.out.println("La media de las temperaturas es de " + media + "ºC.");

		int temperaturasAltas = 0;
		for (int i = 0; i < temperaturas.length; i++) {

			if (temperaturas[i] > 12) {
				temperaturasAltas++;
			}

		}

		System.out.println("\nHa habido " + temperaturasAltas + " temperaturas de más de 12ºC.");

	}

}
