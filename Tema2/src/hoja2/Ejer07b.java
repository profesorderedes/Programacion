
package hoja2;

public class Ejer07b {

	public static void main(String[] args) {

		int i = 2;
		int numPares = 1;

		do {

			System.out.println(numPares + ") " + i);

			i = i + 2;

			numPares++;

		} while (numPares <= 50);

		System.out.println("Fin.");

	}

}