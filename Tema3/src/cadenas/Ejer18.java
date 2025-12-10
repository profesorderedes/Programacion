package cadenas;

import java.util.Scanner;

public class Ejer18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// String pulgadas = "" + pulgadasTV; Los dos métodos hacen lo mismo.

		String frase = "buenos días clase";

		System.out.println("La frase sin alterar\n> " + frase);

		String[] palabras = frase.split(" ");

		System.out.println("La frase con las iniciales en mayúsculas:");

		for (int i = 0; i < palabras.length; i++) {

			System.out.print(palabras[i].toUpperCase().charAt(0) + palabras[i].substring(1) + " ");

		}

	}

}

//frase.toUpperCase()