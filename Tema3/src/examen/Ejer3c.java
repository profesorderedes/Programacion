package examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer3c {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase y te quitaré los espacios al principio y al final:");
		String frase = "    Érase una vez          ";

		System.out.println("\nFrase original:\n#" + frase + "#");

		String[] palabras = frase.split(" ");
		
		System.out.print("#");
		for (int i = 0; i < palabras.length; i++) {
			
			if(!palabras[i].equals("") && i < palabras.length-1) {
				System.out.print(palabras[i] + " ");
			}else {
				System.out.print(palabras[i]);
			}
			
		}
		System.out.println("#");
//		System.out.println("#" + frase + "#");
		

	}
}
