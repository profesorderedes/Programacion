package hoja3;

public class Ejer07 {

	public static void main(String[] args) {

		int num = 2;

		System.out.println("Múltiplos del 2 hasta 200:");

		while (num <= 200) {

			System.out.println(num);

			if (num % 20 == 0) {
				System.out.println("Divisible por 20.");
			}

			num = num + 2;

		}

	}

}