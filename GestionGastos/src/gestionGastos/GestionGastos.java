package gestionGastos;

import java.util.Scanner;

/**
 * Programa para gestionar gastos personales. Se puede guardar cada gasto. Se
 * pueden añadir los ingresos y sacar a fin de mes un resumen de gastos y un
 * balance. Todos los datos se pueden editar y borrar.
 */
public class GestionGastos {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int operacion = mostrarMenuPrincipal();

		while (operacion != 5) {

			switch (operacion) {
			case 1:
				introducirAsiento();
				break;
			case 2:
				verBalance();
				break;
			case 3:
				editarAsiento();
				break;
			case 4:
				borrarAsiento();
				break;
			}
			operacion = mostrarMenuPrincipal();
		}

		System.out.println("\nGracias por usar Gestión de Gastos.");

	}

	private static int mostrarMenuPrincipal() {

		System.out.println("\n\n*************************************************");
		System.out.println("*               GESTIÓN DE GASTOS               *");
		System.out.println("*************************************************");

		System.out.println("\nElija qué operación quiere hacer:");
		System.out.println("  1) Introducir un asiento");
		System.out.println("  2) Ver balance");
		System.out.println("  3) Editar un asiento");
		System.out.println("  4) Borrar un asiento");
		System.out.println("  5) Salir");
		System.out.print("> ");

		return Consola.leerInt("Tiene que escribir un número entre 1 y 5. Vuelva a intentarlo.", 1, 5);

	}


	private static void introducirAsiento() {

		System.out.println("\n\n*************************************************");
		System.out.println("*               INTRODUCIR ASIENTO              *");
		System.out.println("*************************************************");

	}

	private static void verBalance() {

		System.out.println("\n\n*************************************************");
		System.out.println("*                 VER BALANCE                   *");
		System.out.println("*************************************************");

	}

	private static void editarAsiento() {

		System.out.println("\n\n*************************************************");
		System.out.println("*                EDITAR ASIENTO                 *");
		System.out.println("*************************************************");

	}

	private static void borrarAsiento() {

		System.out.println("\n\n*************************************************");
		System.out.println("*                BORRAR ASIENTO                 *");
		System.out.println("*************************************************");

	}

}
