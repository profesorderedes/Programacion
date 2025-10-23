package hoja2;

import java.util.Scanner;

// 21.- Utiliza un bucle for para preguntar 5 veces por un número entero, 
// y al final devolver la frase "Has fallado".

public class Ejer21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¡Adivina el número! Tienes cinco intentos.\n");
		
		for() {
			System.out.print("Escribe un número: ");
			int num = entrada.nextInt();
		}
		
		System.out.println("\n¡Has fallado!");
		
	}

}
