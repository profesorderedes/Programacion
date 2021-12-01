package ejercicios1;

/*
 * Algoritmo que, dado un número num, averigua si es primo
 * o no.
 */
public class Ejer14b {

	public static void main(String[] args) {

		int num = 35;
		boolean esPrimo = true;

		for (int i = 2; i < num; i++) {

			System.out.println(num + "/" + i + " da resto " 
					+ num % i);
			
			if (num % i == 0) {
				System.out.println("¡¡¡NO ES PRIMO!!!");
				esPrimo = false;
				break;
			}

		}

		if (esPrimo) {
			System.out.println(num + " es primo.");
		} else {
			System.out.println(num + " es compuesto.");
		}

	}

}
