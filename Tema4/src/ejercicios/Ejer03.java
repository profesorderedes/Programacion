package ejercicios;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		System.out.println(leerNombre());

	}

	static String leerNombre() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuál es tu nombre?");
		String nombre = entrada.nextLine();
		return nombre;

	}

}