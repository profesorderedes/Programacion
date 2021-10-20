package actividades;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Primer número: ");
		float num1 = entrada.nextFloat();

		System.out.print("Segundo número: ");
		float num2 = entrada.nextFloat();

		System.out.println("El resultado de multiplicar " + num1 + " por " + num2 + " es " + num1 * num2);

	}

}
