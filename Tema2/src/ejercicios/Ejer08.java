package ejercicios;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

// Crea un programa que pregunte al usuario cómo se dice en inglés "ordenador". Si el usuario

// responde "computer" entonces recibirá una felicitación. Si no, recibirá un mensaje de consolación.

		String ingles = "computer";

		System.out.println("Escriba ordenador en inglés.");
		String ordenador = sc.nextLine();

		if (ordenador.equals(ingles)) {
			System.out.println("Felicidades.");
		} else {
			System.out.println("Incorrecto.");
		}

		sc.close();

	}

}
