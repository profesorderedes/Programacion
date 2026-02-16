package ejemplo04Interfaces;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe el número del día de la semana en que estamos:");
		int num = entrada.nextInt();

		nombreDia(num);

	}

	public static void nombreDia(int numDia) {

		switch (numDia) {
		case DiaSemana.LUNES:
			System.out.println("Estamos a lunes.");
			break;

		case DiaSemana.MARTES:
			System.out.println("Estamos a martes.");
			break;

		case DiaSemana.MIERCOLES:
			System.out.println("Estamos a miércoles.");
			break;

		case DiaSemana.JUEVES:
			System.out.println("Estamos a jueves.");
			break;

		case DiaSemana.VIERNES:
			System.out.println("Estamos a viernes.");
			break;

		case DiaSemana.SABADO:
			System.out.println("Estamos a sábado.");
			break;

		case DiaSemana.DOMINGO:
			System.out.println("Estamos a domingo.");
			break;

		}

	}
}
