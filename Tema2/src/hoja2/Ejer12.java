package hoja2;

public class Ejer12 {

	public static void main(String[] args) {
		// Modifica el programa anterior para que no aparezcan los múltiplos de 5 sino
		// que, al final,
		// simplemente se muestre la suma de todos ellos. Utiliza un bucle while.

		int i = 5;
		int suma = 0;

		while (i <= 1000) {
			suma = suma + i;
			i = i + 5;
		}

		System.out.println("Suma de los múltiplos de 5 menores de 1000: " + suma);
	}

}
