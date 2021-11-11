package ejercicios1;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un numero");
		int numero = entrada.nextInt();

		String compara;
		compara = numero % 2 == 0 ? "Par" : "Impar";

		System.out.println(compara);

	}

}