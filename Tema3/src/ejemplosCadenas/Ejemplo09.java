package ejemplosCadenas;

import java.util.Scanner;

// Programa que pregunta una frase al usuario y dos letras, y 
// sustituye una letra por la otra en la frase (todas las veces que
// aparezcan).

// Forma rápida: usando replace.

public class Ejemplo09 {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe una frase: ");
		String frase = entrada.nextLine();

		System.out.print("Escribe una letra: ");
		String letra1 = entrada.nextLine();

		System.out.print("Escribe otra letra: ");
		String letra2 = entrada.nextLine();

		String nuevaFrase = frase.replace(letra1, letra2);
		System.out.println(nuevaFrase);

	}

}
