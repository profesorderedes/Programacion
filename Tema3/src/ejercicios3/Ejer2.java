package ejercicios3;

public class Ejer2 {

	public static void main(String[] args) {

		double cotizaciones[] = { 47.5, 47.8, 48, 48.1, 
				47.7, 47.3, 46, 47.9, 48.05, 48.7 };
		int posMax = 0;
		int posMin = 0;

		for (int i = 1; i < cotizaciones.length; i++) {
			if (cotizaciones[i] < cotizaciones[posMin]) {
				posMin = i;
			}

			if (cotizaciones[i] > cotizaciones[posMax]) {
				posMax = i;
			}

		}

		System.out.println("Acciones Microsoft");
		System.out.println("----------------------");
		System.out.println("Valor mínimo de acción = " 
				+ cotizaciones[posMin]);
		System.out.println("Valor máximo de acción = " 
				+ cotizaciones[posMax]);

	}

}