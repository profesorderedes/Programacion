package ejerciciosCadenas;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime una frase: ");
		String frase = entrada.nextLine();
		
		int posPrimerEspacio = frase.indexOf(" ");

		for (int i = posPrimerEspacio + 1; i < frase.length(); i++) {

			System.out.print(frase.charAt(i));

		}

	}

}