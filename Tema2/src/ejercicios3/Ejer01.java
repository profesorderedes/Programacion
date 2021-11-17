package ejercicios3;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int aleatorio = (int) (Math.random() * 10 + 1);
		int intentos = 0;
		int num = 0;
		System.out.println(aleatorio);
		
		System.out.println("Intenta adivinar un número del 1 al "
				+ "10: \n");

		while (num != aleatorio && intentos < 3) {
			
			System.out.println("Te quedan " + (3 - intentos) 
					+ " intentos");
			System.out.println("¿Número?");
			num = entrada.nextInt();
			intentos++;

		}

		if (num == aleatorio) {
			System.out.println("\n¡Muy bien! \n¡Has acertado al " 
					+ intentos + " intento!");
		} else {
			System.out.println("\n¡Has fallado! \nOtra vez sera..."
					+ " \nEl número era el " + aleatorio);
		}
	}
}