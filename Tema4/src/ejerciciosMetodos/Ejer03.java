package ejerciciosMetodos;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		System.out.println(devolverNombre());

	}

	static String devolverNombre() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cómo te llamas?");
		return entrada.nextLine();

	}

}