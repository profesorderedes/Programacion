package inicio;

import java.util.Scanner;

import conversion.Conversor;

public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Pregunta una cantidad en km y la pasa a millas.
		System.out.println("Escribe una distancia en km:");
		double distKm = entrada.nextDouble();

		System.out.println(distKm + " km son " + Conversor.millas(distKm) + " millas.");

		// Pregunta una cantidad en millas y la pasa a km.
		System.out.println("\nEscribe una distancia en millas:");
		double distMillas = entrada.nextDouble();

		System.out.println(distMillas + " millas son " + Conversor.km(distMillas) + " km.");
		
		// Pregunta una cantidad en milibares y la pasa a atm.
		System.out.println("Escribe una cantidad en milibares y la pasaré a atmosferas: ");
		double mil = entrada.nextDouble();

		System.out.println(mil + " milibares son " + Conversor.atmosferas(mil) + " atmosferas.");

		// Pregunta una cantidad en atm y la pasa a mb.
		System.out.println("Escribe una cantidad en atmosferas y la pasaré a milibares: ");
		double atm = entrada.nextDouble();

		System.out.println(atm + " atmosferas son " + Conversor.milibares(atm) + " milibares.");

		// Pregunta una cantidad en calorías y la pasa a julios.
		System.out.println("Escribe una cantidad en calorías y la pasaré a julios: ");
		double cal = entrada.nextDouble();

		System.out.println(cal + " calorías son " + Conversor.julios(cal) + " julios.");

		// Pregunta una cantidad en julios y la pasa a cal.
		System.out.println("Escribe una cantidad en julios y la pasaré a calorías: ");
		double jul = entrada.nextDouble();

		System.out.println(jul + " julios son " + Conversor.calorias(jul) + " calorías.");

	}

}
