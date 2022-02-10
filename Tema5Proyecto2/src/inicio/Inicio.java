package inicio;

import java.util.Scanner;

import conversion.Conversor;

public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Pregunta una cantidad en km y la pasa a millas.
		System.out.println("Escribe una distancia en km:");
		double distKm = entrada.nextDouble();

		System.out.println(distKm + " km son " 
				+ Conversor.millas(distKm) + " millas.");

		// Pregunta una cantidad en millas y la pasa a km.
		System.out.println("\nEscribe una distancia en millas:");
		double distMillas = entrada.nextDouble();

		System.out.println(distMillas + " millas son " 
				+ Conversor.km(distMillas) + " km.");

	
		
		
	}

}





