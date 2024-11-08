package hoja1;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] ans = new String[5];

		System.out.println("Dame una pregunta");
		ans[0] = entrada.nextLine();

		System.out.println("Dame 4 respuetsas para la pregunta");

		for (int i = 1; i < ans.length; i++) {

			System.out.println("La respuesta " + (i + 1) + " es:");
			ans[i] = entrada.nextLine();

		}

		System.out.println(ans[0] + "\na) " + ans[1] + "\nb) " + ans[2] + "\nc) " + ans[3] + "\nd) " + ans[4]);

	}

}