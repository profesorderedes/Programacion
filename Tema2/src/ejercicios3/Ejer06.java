package ejercicios3;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num;
		do {
			num = entrada.nextInt();

			if (num == 1) {
				System.out.println("No seas tonto");
				continue;
			}

			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + num * i);
			}

			if (num == 0) {
				break;
			}
		} while (true);
	}
}