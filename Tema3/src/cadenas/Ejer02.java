package cadenas;

import java.util.Scanner;

// Actividad 2: Programa que lea una contraseña y valide si cumple 
// con una longitud mínima de 6 y máxima de 12.

public class Ejer02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce tu contraseña: ");
		String contraseña = sc.nextLine();

		if (contraseña.length() >= 6 && contraseña.length() <= 12) {

			System.out.println("Contraseña válida.");

		} else {

			System.out.println("Contraseña no válida.");

		}

	}

}