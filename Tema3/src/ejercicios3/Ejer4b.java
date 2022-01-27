package ejercicios3;

public class Ejer4b {

	public static void main(String[] args) {

		double temperaturas[] = { 3.2, 3.5, 7.2, 0.1, 1, -2.3, -5, 3.4, 4, 4, 4, 1.4, 2.5, -0.4, -3.6 };

		int posNegativa = -1;

		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] < 0) {
				posNegativa = i;
				break;
			}
		}

		System.out.println("La primera posición donde hay una temperatura negativa es: " + posNegativa + ".");

	}

}
