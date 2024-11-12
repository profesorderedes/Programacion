package hoja1;

import java.util.Scanner;

// Programa que te pregunta un número entero positivo y te dice 
// si es primo o compuesto.
public class Ejer14a {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número y te digo si es primo:");
		int num = entrada.nextInt();
		
		// Probamos a dividir el número por todos los que están entre 
		// 1 y él (sin incluir los extremos).
		
		// La variable esPrimo nos indicará al final del bucle
		// si el número es primo o no. Empezamos suponiendo que lo es.
		boolean esPrimo = true;
		
		for(int i = 2; i < num; i++) {
			
			System.out.println("Probamos a dividir por " + i);
			
			// Intentamos dividir num entre i. i va a ir tomando
			// todos los valores entre 2 y num (sin incluir num).
			// Si una de las divisiones da resto 0, el número 
			// automáticamente es compuesto.
			if(num % i == 0) {
				System.out.println("Es compuesto");
				esPrimo = false;
				break;
			}
			
		}
		
		// Si, tras el bucle, ninguna división ha dado resto 0, 
		// la variable esPrimo habrá conservado su valor inicial,
		// true.
		if(esPrimo) {
			System.out.println("Es primo");
		}

	}

}





