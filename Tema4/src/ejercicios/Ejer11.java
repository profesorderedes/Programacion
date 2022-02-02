package ejercicios;

import java.util.Scanner;

public class Ejer11 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String[] planetas = { "Mercurio", "Venus", "Tierra", 
				"Marte", "Júpiter", "Saturno", "Urano", 
				"Neptuno","Plutón" };
		
		System.out.println("¡Escribe un nombre y te diré "
				+ "si es un planeta!");
		String planeta = entrada.nextLine();
		
		int pos = buscar(planetas, planeta);
		if(pos != -1) {
			System.out.println("El planeta está en la "
					+ "posición " + pos);
		}else {
			System.out.println("La palabra no se encuentra "
					+ "en el array.");
		}
		
	}

	static int buscar(String array[], String planeta) {

		for (int i = 0; i < array.length; i++) {

			if (array[i].equals(planeta)) {
				return i;
			}

		}
		
		return -1;
		
	}

}