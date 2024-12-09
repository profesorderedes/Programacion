package ejerciciosCadenas;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime una frase: ");
		String frase = entrada.nextLine();

		// Recorremos la cadena de espacio en espacio.
		int posEspacioAnterior = 0;
		int posEspacioSiguiente = 0;

		while (posEspacioSiguiente != -1) {

			posEspacioSiguiente = frase.indexOf(" ", posEspacioSiguiente + 1);
			
			if (posEspacioSiguiente == -1) {
				System.out.println(frase.substring(posEspacioAnterior));
			} else {
				System.out.println(frase.substring(posEspacioAnterior, posEspacioSiguiente + 1));
				posEspacioAnterior = posEspacioSiguiente + 1;
			}

		}

	}

}
