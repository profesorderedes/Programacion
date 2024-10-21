package hoja2;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escriba un número que desee multiplicar:");
		int num = entrada.nextInt();

		int i = 1;

		while (i <= 10) {

			System.out.println(num + " x " + i + " = " + (num * i));

			i++;

		}

	}

}