package ejercicios1;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe tu nota: ");
		float nota = entrada.nextFloat();

		if (nota < 4) {
			System.out.println("Rojo");
		} else if (nota < 5) {
			System.out.println("Verde");
		} else {
			System.out.println("Azul");
		}

	}

}