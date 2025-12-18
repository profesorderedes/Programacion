package ejercicios;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame una temperatura en grados centígrados: ");
		double temp = entrada.nextDouble();

		System.out.println(temp + "ºC en fahrenheit es " + fahrenheit(temp) + "ºF.");

	}

	static double fahrenheit(double temp) {

		return (temp * 9 / 5) + 32;

	}

}