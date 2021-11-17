package ejercicios3;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int numAleatorio1 = (int) (Math.random() * 100 + 1);
		int numAleatorio2 = (int) (Math.random() * 100 + 1);
		
		int suma = (numAleatorio1 + numAleatorio2);
		int sumaUser;

		System.out.println("\n¿TE VES CAPAZ DE SUMAR MENTALMENTE? \n\n¿Cual es el resultado de " + numAleatorio1 + " + "
				+ numAleatorio2 + "?");
		while (true) {
			System.out.println("Escribe el resultado(" + numAleatorio1 + " + " + numAleatorio2 + "): ");
			sumaUser = entrada.nextInt();
			if (sumaUser == suma) {
				System.out.println("¡NO ME LO PUEDO CREER! \n¡HAS ACERTADO!");
				break;
			} else {
				System.out.println("Sigue intentandolo");
			}
		}
		System.out.println("\n¡Hasta la próxima!");
	}

}