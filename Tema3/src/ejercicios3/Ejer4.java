package ejercicios3;

public class Ejer4 {

	public static void main(String[] args) {

		double temperaturas[] = { 3.2, 3.5, 7.2, 0.1, 1, -2.3, -5, 3.4, 4, 4, 4, 1.4, 2.5, -0.4, -3.6 };
		boolean positivo = true;

		for (int i = 0; i < temperaturas.length; i++) {

			if (temperaturas[i] < 0) {
				System.out.println("Posición: " + i);
				positivo = false;
				break;
			}

		}
		if (positivo == true) {
			System.out.println("Resultado: -1");
		}

	}

}