package ejercicios2;

public class Ejer3 {

	public static void main(String[] args) {

		int i = 1;
		int potencia = 3;

		do {

			System.out.println(i + ") " + potencia);

			i++;
			potencia = (int) Math.pow(3, i);

		} while (potencia < 12000);

	}

}
