package ejercicios;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un numero del 1 al 10");

		int numero = teclado.nextInt();

		if (numero != 3) {
			System.out.println("Lo siento has perdido");
		} else {
			System.out.println("Correcto , has ganado");
		}

	}

}