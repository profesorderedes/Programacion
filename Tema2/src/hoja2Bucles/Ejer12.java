package hoja2Bucles;

public class Ejer12 {

	public static void main(String[] args) {

		System.out.println("Esto es la suma total de todos los múltiplos " + "de 5 entre 1 y 1000.");

		int multiplo = 0;
		int sumaTotal = 0;

		while (multiplo <= 1000) {

			sumaTotal = multiplo + sumaTotal;
			multiplo += 5;

		}

		System.out.println("Suma total de los múltiplos de 5 " + "entre 1 y 1000: " + sumaTotal);

	}

}