package hoja3;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num;

		do {
			System.out.print("Escriba el número que desee para ver su tabla de multiplicar: ");
			num = entrada.nextInt();

			System.out.println("Tabla de multiplicar del " + num + ":");
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + (num * i));
			}

			System.out.println();

		} while (num != 0);

		System.out.println("Has introducido el número 0. El programa ha finalizado.");
		
	}
}