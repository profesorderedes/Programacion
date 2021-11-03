package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un numero entre el 1 y el 10: ");

		if (entrada.hasNextInt() == true) {
			
			int numero = entrada.nextInt();
			
			if (numero >= 1 && numero <= 10) {
				
				if (numero == 3) {
					System.out.println("HAS ACERTADO EL NÚMERO !!");
				}
				System.out.println("El número introducido es correcto.");
				
			} else {
				System.out.println("El número introducido es incorrecto.");
			}

		} else {
			
			System.out.println("No has introducido un número válido.");
			
		}

	}

}