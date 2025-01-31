package inicio;

import java.util.Scanner;

import conversion.Conversor;

public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("***** CONVERSOR *****");

		System.out.print("\nQuilómetros: ");
		double km = entrada.nextDouble();

		System.out.println(km + " quilómetros son " + Conversor.millas(km) + " millas.");

		System.out.print("\nMillas: ");
		double millas = entrada.nextDouble();

		System.out.println(millas + " millas son " + Conversor.km(millas) + " quilómetros.");

		System.out.print("\nMilibares: ");
		double mb = entrada.nextDouble();

		System.out.println(mb + " milibares son " + Conversor.atmosferas(mb) + " atmósferas.");

		System.out.print("\nAtmósferas: ");
		double atmosferas = entrada.nextDouble();

		System.out.println(atmosferas + " atmósferas son " + Conversor.milibares(atmosferas) + " milibares.");

		System.out.print("\nCalorías: ");
		double calorias = entrada.nextDouble();

		System.out.println(calorias + " calorías son " + Conversor.julios(calorias) + " julios.");

		System.out.print("\nJulios: ");
		double julios = entrada.nextDouble();

		System.out.println(julios + " julios son " + Conversor.calorias(julios) + " calorias.");
	}

}
