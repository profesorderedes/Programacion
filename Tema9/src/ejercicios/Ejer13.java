package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe una frase, por favor: ");
		String frase = entrada.nextLine();

		// Pasamos la cadena a minúsculas y eliminamos los espacios.
		String fraseNueva = frase.toLowerCase().replace(" ", "");
		
		System.out.println("Frase: " + frase);
		if(esPalindromo(fraseNueva, 0, fraseNueva.length()-1)) {
			System.out.println("\"" + frase + "\"" + " es palíndromo.");
		}else {
			System.out.println("\"" + frase + "\"" + " no es palíndromo.");
		}

	}

	private static boolean esPalindromo(String frase, int ini, int fin) {

		// Caso base
		if (ini >= fin) {
			return true;
		}

		// Caso recursivo
		if (frase.charAt(ini) == frase.charAt(fin)) {
			return esPalindromo(frase, ini + 1, fin - 1);
		}

		return false;

	}

//	private String quitarEspacios(String frase) {
//
//		String fraseNueva = "";
//
//		// Recorremos la cadena frase guardando cada carácter en fraseNueva, excepto los
//		// espacios.
//		for (int i = 0; i < frase.length(); i++) {
//			if (frase.charAt(i) != ' ') {
//				fraseNueva = fraseNueva + frase.charAt(i);
//			}
//		}
//
//		return fraseNueva;
//
//	}

}
