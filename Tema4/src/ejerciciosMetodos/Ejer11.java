package ejerciciosMetodos;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el año: ");
		int anyo = entrada.nextInt();

		if (esBisiesto(anyo)) {
			System.out.println(anyo + " es bisiesto.");
		} else {
			System.out.println(anyo + " no es bisiesto.");
		}

	}

	static boolean esBisiesto(int año) {

		return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

	}

}