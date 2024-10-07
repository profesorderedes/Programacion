package ejercicios;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		// Crea un programa que pida la temperatura de un reactor nuclear. Si ésta
		// supera los 120ºC, semostrará en pantalla el mensaje: "TEMPERATURA DEL REACTOR
		// CRÍTICA. ¡CORRED,INSENSATOS!

		Scanner entrada = new Scanner(System.in);

		System.out.println("Temperatura del reactor: ");
		int temperatura = entrada.nextInt();

		if (temperatura > 120) {
			System.out.println("TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED,INSENSATOS!");
		}

	}

}