package hoja1;

public class Ejer16 {

	public static void main(String[] args) {

// Crea un programa que declare un array con las siguientes temperaturas de las últimas dos
// semanas y devuelva la temperatura media:

		double temps[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };
		double suma = 0;
		int altas = 0;

		for (int i = 0; i < temps.length; i++) {

			suma = suma + temps[i];
			
			if(temps[i] > 12) {
				altas++;
			}

		}
	
		System.out.println("Temperatura media: " + suma / temps.length + "ºC.");
		System.out.println("Número de temperaturas superiores a 12ºC: " + altas + ".");

	}

}