package net.iessonferrer.io;

public class Main {

	public static void main(String[] args) {

		System.out.println("Dime tu edad:");
		int edad = ConsolaB.leerInt("¡Tenías que escribir tu edad como número entero!");

		System.out.println("Tienes " + edad + " años.");

		System.out.println("Dime tu edad:");
		edad = ConsolaB.leerInt("¡Tenías que escribir tu edad como número entero!");

		System.out.println("Tienes " + edad + " años.");

	}

}
