package hoja3;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {

// 12.- Escribe un programa para monitorizar la presión de un reactor químico. Se le preguntará al
// usuario un valor de presión (con decimales).
// Si la presión tiene un valor entre 1 y 1'7 atmósferas (ambos inclusive), se mostrará el mensaje
// "Presión normal". Si es mayor de 1'7 atm, se mostrará una alerta como "Presión excesiva, hay
// riesgo de explosión". Si, en cambio, la presión es menor de 1 atm, se indicará algo como "Presión
// baja, riesgo de vertido".
// El proceso se irá repitiendo mientras los valores no bajen de 0'4 atm ni pasen de 2'5 atm.

		Scanner input = new Scanner(System.in);

		float presion;

		System.out.println("MONITOR DE PRESIÓN DEL REACTOR\n----------------------------------");

		do {

			System.out.println("\nDime la presión (en atm) > ");
			presion = input.nextFloat();

			if (presion < 1) {

				System.out.println("Presión baja, riesgo de vertido");

			} else if (presion > 1.7) {

				System.out.println("Presión excesiva, hay riesgo de explosión");

			} else {

				System.out.println("Presión normal");

			}

		} while (presion >= 0.4 && presion <= 2.5);

	}

}