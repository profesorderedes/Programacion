package ejercicios;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escriba el primer coeficiente:");
		double a = entrada.nextDouble();

		System.out.println("Escriba el segundo coeficiente:");
		double b = entrada.nextDouble();

		System.out.println("Escriba el tercer coeficiente:");
		double c = entrada.nextDouble();

		System.out.println("Soluciones:");
		System.out.println("   x = " + sol1(a, b, c));
		System.out.println("   x = " + sol2(a, b, c));

	}

	static double sol1(double a, double b, double c) {
		return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	}

	static double sol2(double a, double b, double c) {
		return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	}

}