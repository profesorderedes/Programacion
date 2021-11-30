package ejercicios1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String instrucciones[] = new String[1000];

		System.out.println("Introduce las instrucciones que " + "debe realizar el robot.");
		int i = 0;

		while (i < instrucciones.length) {

			System.out.print("Instrucción " + (i + 1) + ": ");
			instrucciones[i] = entrada.nextLine();

			if (instrucciones[i].equals("ejecutar")) {
				break;
			}

			i++;
		}

		System.out.println("\nProcesos a realizar.\n=====================\n");
		i = 0;
		while (i < instrucciones.length) {

			if (instrucciones[i].equals("ejecutar")) {
				System.out.println("\nProceso realizado.");
				break;
			} else {
				System.out.println("Instrucción " + (i + 1) + ": " + instrucciones[i] + ".");
			}

			i++;

		}
	}
}