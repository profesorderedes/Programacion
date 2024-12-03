package ejerciciosCadenas;

import java.util.Scanner;

public class Ejer03 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¡Escribe una palabra y te la mostraré del revés!");
		String palabra = entrada.nextLine();
		
		// Recorremos la cadena empezando por el final.
		for(int i = palabra.length()-1; i >=0; i--) {
			System.out.print(palabra.charAt(i));
		}
	}

}






