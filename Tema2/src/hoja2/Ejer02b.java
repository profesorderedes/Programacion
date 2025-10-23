package hoja2;

import java.util.Scanner;

// 2.- Modifica el programa anterior para que pida un carácter y también el número 
// de veces que queremos repetirlo.

public class Ejer02b {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un carácter: ");
		String caracter = entrada.nextLine();
		
		System.out.println("¿Cuántas veces quieres mostrarlo?");
		int repeticiones = entrada.nextInt();
		
		for() {
			System.out.println(caracter);
		}
		
	}

}
