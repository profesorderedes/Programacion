package hoja2;

import java.util.Scanner;

public class Ejer09b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Inserte el número a dividir");
		int dividendo = entrada.nextInt();

		System.out.println("Inserte el dividendo");
		int divisor = entrada.nextInt();
		
		boolean seguirRestando = true;

		while (seguirRestando) {

			dividendo -= divisor;
			System.out.println(dividendo + " - " + divisor + " = " + dividendo);
			
			// Paramos de restar cuando el dividendo sea menor que el divisor.
			if(divisor > dividendo) {
				seguirRestando = false;
			}

		}

		System.out.println("El resto será " + dividendo);

	}

}