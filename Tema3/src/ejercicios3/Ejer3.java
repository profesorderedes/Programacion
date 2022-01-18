package ejercicios3;

public class Ejer3 {

	public static void main(String[] args) {

		float cotizaciones[] = { 47.5F, 47.8F, 48, 47.7F, 47.3F, 46, 47.9F, 48.05F, 48.7F };

		// Usamos el método de selección para ordenar el array.
		int posMin = 0;

		float aux;

		for (int i = 0; i < cotizaciones.length - 1; i++) {

			for (int j = i + 1; j < cotizaciones.length; j++) {
				if (cotizaciones[j] < cotizaciones[posMin]) {
					posMin = j;
				}

			}

			aux = cotizaciones[posMin];
			cotizaciones[posMin] = cotizaciones[i];
			cotizaciones[i] = aux;
		}

		System.out.println("Las cotizaciones ordenadas de menor a mayor son: ");
		System.out.println("--------------------------------------------------");

		for (int i = 0; i < cotizaciones.length; i++) {

			System.out.print("\n" + cotizaciones[i]);
		}

	}

}