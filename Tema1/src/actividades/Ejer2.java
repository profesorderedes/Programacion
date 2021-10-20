package actividades;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Primer número: ");
		int num1 = entrada.nextInt();

		System.out.print("Segundo número: ");
		int num2 = entrada.nextInt();

		System.out.println("El resto de dividir " + num1 + " entre " + num2 + " es " + num1 % num2);

	}

}
