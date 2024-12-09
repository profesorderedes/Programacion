package ejerciciosCadenas;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime una frase: ");
		String frase = entrada.nextLine();

		// Número de espacios encontrados en la frase.
		int espacios = 0;

		// Vamos buscando cada espacio a partir del anterior.
		int posSiguienteEspacio = 0;

		// Buscamos el resto de espacios.
		while (posSiguienteEspacio != -1) {

			posSiguienteEspacio = frase.indexOf(" ", posSiguienteEspacio + 1);
			if (posSiguienteEspacio != -1) {
				espacios++;
			}
		}

		System.out.println("Número de palabras = " + (espacios + 1));

	}

}
