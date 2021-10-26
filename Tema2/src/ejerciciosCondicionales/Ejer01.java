package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime la temperatura: ");
		float temperatura = entrada.nextFloat();

		if (temperatura > 120) {
			System.out.println("TEMPERATURA DEL REACTOR CRITICA,¡CORRED INSENSATOS!");
		}

	}

}