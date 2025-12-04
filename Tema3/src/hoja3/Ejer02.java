package hoja3;

public class Ejer02 {

	public static void main(String[] args) {

		/*
		 * A lo largo de diez días los valores de las acciones de Microsoft al cierre
		 * del mercado han sido las siguientes. Diseña un programa que calcule el mínimo
		 * y el máximo de los valores mencionados. Utiliza un array de nombre
		 * cotizaciones. Introduce los datos directamente en el código del programa.
		 */

		double[] cotizaciones = { 47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 47.9, 48.05, 48.7 };

		int posMin = 0;
		int posMax = 0;

		for (int i = 0; i < cotizaciones.length; i++) {

			if (cotizaciones[i] < cotizaciones[posMin]) {
				posMin = i;
			} else if (cotizaciones[i] > cotizaciones[posMax]) {
				posMax = i;
			}

		}

		System.out.println("La cotización más baja ha sido: " + cotizaciones[posMin]);
		System.out.println("La cotización más alta ha sido: " + cotizaciones[posMax]);
	}

}