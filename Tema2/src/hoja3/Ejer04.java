package hoja3;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		while (true) {

			int num1 = (int) (Math.random() * 100 + 1);
			int num2 = (int) (Math.random() * 100 + 1);

			int suma = num1 + num2;

			System.out.println("¿Cuál es la suma de " + num1 + " más " + num2 + "?");
			int respuesta = entrada.nextInt();

			if (respuesta == suma) {
				System.out.println("¡Has acertado!");
			} else {
				System.out.println("Has fallado. La suma era " + suma + ".");
			}

			// Preguntamos si quiere continuar.
			entrada.nextLine();
			System.out.println("¿Quieres continuar (s/n)?");
			char continuar = entrada.nextLine().charAt(0);

			if (continuar == 'n') {
				break;
			}

		}

	}

}