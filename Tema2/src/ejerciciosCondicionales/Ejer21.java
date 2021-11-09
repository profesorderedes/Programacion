package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Dinos tu nombre");
		String nombre = input.nextLine();

		nombre = nombre.equals("") ? "Desconocido" : nombre;

		System.out.println(nombre);
	}

}