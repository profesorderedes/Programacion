package hoja1;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Dime el número de un mes > ");
		int mes = input.nextInt();

		if (mes > 12 || mes < 1) {

			System.out.println("Mes incorrecto");

		} else {

			System.out.println("Mes correcto");

		}

	}

}