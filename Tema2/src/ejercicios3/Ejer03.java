package ejercicios3;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numAleatorio1;
		int numAleatorio2;
		int suma;
		int sumaUser;

		System.out.println("\n¿TE VES CAPAZ DE SUMAR MENTALMENTE? \n\n");

		while (true) {

			numAleatorio1 = (int) (Math.random() * 100 + 1);
			numAleatorio2 = (int) (Math.random() * 100 + 1);

			suma = numAleatorio1 + numAleatorio2;

			System.out.println("\n¿Cual es el resultado de sumar " + numAleatorio1 + " y " + numAleatorio2 + "?");

			System.out.println("Escribe el resultado(" + numAleatorio1 + " + " + numAleatorio2 + "): ");
			sumaUser = entrada.nextInt();

			if (sumaUser == suma) {
				System.out.println("¡NO ME LO PUEDO CREER! \n¡HAS ACERTADO!");
			} else {
				System.out.println("Sigue intentandolo");
			}

		}

	}

}