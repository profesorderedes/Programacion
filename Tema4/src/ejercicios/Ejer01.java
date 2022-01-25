package ejercicios;

import java.util.Scanner;

public class Ejer01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cómo te llamas?");
		String nombre = entrada.nextLine();
		
		System.out.println("¿Cúantos años tienes?");
		int edad = entrada.nextInt();
		
		saludar(nombre, edad);
		
		
	}
	
	static void saludar(String nombre, int edad) {
		
		System.out.println("Hola, " + nombre + ", no "
				+ "parece que tengas " + edad + " años.");
		
	}

}
