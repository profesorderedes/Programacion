package hoja2;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca un carácter:");
		String caracter = entrada.nextLine();

		System.out.println("¿Cuantas veces deseas repetir el carácter? ");
		int repeticion = entrada.nextInt();

		int i = 1;

		while (i <= repeticion) {

			System.out.println(caracter);
			i++;

		}
		
	}

}