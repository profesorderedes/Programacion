package ejercicios;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime una temperatura en Farenheit");
		float temperatura = entrada.nextFloat();

		System.out.println("La temperatura en celsius es: " + celsius(temperatura));

	}

	static float celsius(float temperatura) {
		return (temperatura - 32) * 5 / 9;
	}

}