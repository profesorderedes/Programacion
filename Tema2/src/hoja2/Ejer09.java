package hoja2;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {
//		Escribe un programa que calcule el resto de una división entre enteros con el procedimiento de ir
//		restando repetidamente el divisor del dividendo hasta que el resultado es menor que el divisor.
//		Ejemplo de esta operación: 
//		20 % 6
//		20 - 6 = 14
//		14 – 6 = 8
//		8 – 6 = 2 Ahí paramos, ya que la resta da un número menor que 6. El resto vale 2

		Scanner input = new Scanner(System.in);

		System.out.println("Número 1: ");
		int num1 = input.nextInt();

		System.out.println("Número 2: ");
		int num2 = input.nextInt();

		if (num1 < num2) {
			System.out.println("Esos valores no son correctos.");
			return;
		}

		while (num1 >= num2) {

			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			num1 = num1 - num2;
		}
		System.out.println("El resto es " + num1);
	}

}
