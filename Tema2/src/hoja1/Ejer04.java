package hoja1;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduzca su PIN (cuatro números del 0-9): ");
		String contrasenya = input.nextLine();

		if (contrasenya.equals("1234")) {

			System.out.println("Acceso concedido");

		} else {

			System.out.println("Incorrecto");

		}

	}

}