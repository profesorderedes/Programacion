package ejercicios;

import java.util.Scanner;

// Ejercicio previo al 19 de la hoja 1 de condicionales.

// Se pide al usuario un número de año y el programa nos dice si 
// es bisiesto o no.

public class Ejer19a {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número de año:");
		int anyo = entrada.nextInt();

		if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0) {
			System.out.println("Es bisiesto");
		}else {
			System.out.println("No es bisiesto.");
		}

	}
}










