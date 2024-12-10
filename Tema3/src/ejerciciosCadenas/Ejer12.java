package ejerciciosCadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		

		System.out.print("Dime una frase: ");
		String frase = entrada.nextLine();

		// Como máximo habrá tantas palabras como letras.
		String[] palabras = new String[frase.length()];
		
		// Recorremos la cadena de espacio en espacio.
		int ini = 0;
		int fin;
		int pos = 0;
		
		// Mientras quede algún espacio en la frase, seguimos mostrando palabras.
		while (frase.indexOf(" ", ini) != -1) {

			// fin será la posición del siguiente espacio
			fin = frase.indexOf(" ", ini);
			
			// Mostramos la palabra entre las posiciones ini y fin.
			//System.out.println(frase.substring(ini, fin));
			palabras[pos] = frase.substring(ini, fin);
			pos++;

			// Actualizamos ini para que sea la posición justo después del 
			// espacio.
			ini = fin + 1;
			
		}
		
		// Falta por mostrar la última palabra, ya que ésta no tiene un espacio
		// al final.
		//System.out.println(frase.substring(ini));
		palabras[pos] = frase.substring(ini);
		
		for (int i = 0; i < palabras.length; i++) {
			if(palabras[i] == null) {
				break;
			}
			System.out.println(palabras[i]);
		}

	}

}


