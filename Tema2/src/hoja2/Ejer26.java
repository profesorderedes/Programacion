package hoja2;

import java.util.Scanner;

public class Ejer26 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {

			System.out.println("¿De qué número quieres su tabla de multiplicar?");
			int num = entrada.nextInt();

			if (num == 1) {
				System.out.println("¡No seas tonto!");
				continue;
			}

			for (int j = 1; j <= 10; j++) {
				int tabla = num * j;
				System.out.println(num + " x " + j + " = " + tabla);
			}
		}

	}
}
