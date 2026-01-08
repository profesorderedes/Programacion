package ejerciciosMetodos;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame una temperatura en grados fahrenheit: ");
		double temp = entrada.nextDouble();

		System.out.println(temp + "ºF en centígrados es " + centigrados(temp) + "ºC.");

	}

	static double centigrados(double temp) {

		return (temp - 32) * 5 / 9;

	}

}