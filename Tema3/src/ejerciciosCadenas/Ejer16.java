package ejerciciosCadenas;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¡¡Escribe una frase y te mostraré su acrónimo!!");
		String frase = entrada.nextLine();

		String[] palabras = frase.toUpperCase().split(" ");
		String acronimo = "";

		for(int i = 0; i < palabras.length; i++) {
			//System.out.print(palabras[i].charAt(0));
			acronimo = acronimo + palabras[i].charAt(0);
		}
		
		System.out.println(acronimo);
	}

}
