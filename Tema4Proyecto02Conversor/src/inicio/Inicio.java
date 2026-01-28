package inicio;

import java.util.Scanner;

import conversion.Conversor;

public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Indica una distancia en km: ");
		double km = entrada.nextDouble();
		System.out.println(km + " km son " + Conversor.millas(km) + " millas.");

		System.out.print("Indica una distancia en millas: ");
		double millas = entrada.nextDouble();
		System.out.println(millas + " millas son " + Conversor.km(millas) + " millas.");

		System.out.println("\n100 millas son " + Conversor.km(100) + " km.");
		System.out.println("100 atm son " + Conversor.mb(100) + " mb.");

		System.out.println("100 mb son " + Conversor.atm(100) + " atm.");
		System.out.println("100 julios son " + Conversor.cal(100) + " cal.");
		System.out.println("100 cal son " + Conversor.julios(100) + " julios.");

	}

}