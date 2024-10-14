package ejercicios;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe un número de mes: ");
		int mes = entrada.nextInt();

		if (mes >= 1 && mes <= 12) {
			System.out.println("Mes válido.");
		} else {
			System.out.println("Mes no válido.");
		}

	}
}
