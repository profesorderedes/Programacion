package ejercicios;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime unos grados centigrados y los convierto en farenheit");
		float grados = entrada.nextFloat();

		System.out.println("Los grados farenheit son " + farenheit(grados));

	}

	static float farenheit(float grados) {

		return (grados * 9 / 5) + 32;

	}

}