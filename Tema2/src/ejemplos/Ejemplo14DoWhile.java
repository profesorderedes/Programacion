package ejemplos;

import java.util.Scanner;

public class Ejemplo14DoWhile {

	public static void main(String[] args) {
		
		// Programa que pide un número y repita la pregunta mientras el número introducido
		// no esté entre 1 y 5.
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.print("Escriba un número entre 1 y 5:");
			int num = entrada.nextInt();
		}while();
		
		
	}
	
}
