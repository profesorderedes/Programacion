package ejercicios;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame cualquier número: ");
		double num = entrada.nextDouble();

		System.out.println("El cubo de " + num + " es " + cuboDeNum(num));

	}

	static double cuboDeNum(double num) {

		return num * num * num;

	}

}