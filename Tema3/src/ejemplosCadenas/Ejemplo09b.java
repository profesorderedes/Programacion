package ejemplosCadenas;

import java.util.Scanner;

// Programa que pregunta una frase al usuario y dos letras, y 
// sustituye una letra por la otra en la frase (todas las veces que
// aparezcan).

// Forma manual: sin usar replace.

public class Ejemplo09b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe una frase: ");
		String frase = entrada.nextLine();

		System.out.print("Escribe una letra: ");
		char letra1 = entrada.nextLine().charAt(0);

		System.out.print("Escribe otra letra: ");
		char letra2 = entrada.nextLine().charAt(0);
		
		String nuevaFrase="";
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == letra1) {
				nuevaFrase = nuevaFrase + letra2;
			}else {
				nuevaFrase = nuevaFrase + frase.charAt(i);
			}
		}
		
		System.out.println("Frase modificada:\n" + nuevaFrase);

	}

}
