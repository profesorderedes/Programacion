package ejerciciosCondicionales;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Pon una nota entre 0 y 10");
		float nota = entrada.nextFloat();

		if (nota < 5) {
			System.out.println("Tu " + nota + " es una nota insuficiente");
		} else if (nota < 6) {
			System.out.println("Tu " + nota + " es un suficiente");
		} else if (nota < 7) {
			System.out.println("Tu " + nota + " es un bien");
		} else if (nota < 9) {
			System.out.println("Tu " + nota + " es un Notable");
		} else {
			System.out.println("Tu " + nota + " es sobresaliente");
		}
	}

}