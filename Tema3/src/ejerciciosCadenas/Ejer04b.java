package ejerciciosCadenas;

import java.util.Scanner;

public class Ejer04b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime una frase");
		String frase = entrada.nextLine();
		
		String primeraPalabra="";

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == ' ') {
				break;
			}

			System.out.print(frase.charAt(i));
			

		}
		
		System.out.println("La primera palabra es " + primeraPalabra);

	}

}