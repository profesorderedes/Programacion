package ejerciciosCadenas;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime una frase");
		String frase = entrada.nextLine();

		System.out.println("Dime una letra");
		String letra1 = entrada.nextLine();

		System.out.println("Dime la segunda letra");
		String letra2 = entrada.nextLine();

		System.out.println("Tu frase, con las letras cambiadas, queda así:");
		String nuevaFrase = frase.replace(letra1, letra2);

		System.out.println(nuevaFrase);

	}

}