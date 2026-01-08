package ejerciciosMetodos;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame cualquier número: ");
		double num = entrada.nextDouble();

		System.out.println("El cuadrado de " + num + " es " + cuadradoDeNum(num));

	}

	static double cuadradoDeNum(double num) {

		return num * num;

	}

}