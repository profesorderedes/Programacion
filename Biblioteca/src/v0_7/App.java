package v0_7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		mostrarPresentacion();

		while (true) {
			System.out.println(
					"\n\nMENÚ PRINCIPAL\n======================================================================================================================");

			System.out.println(
					"1) Introducir libro\n2) Editar libro\n3) Borrar libro\n4) Ver todos los libros\n5) Salir");

			System.out.print("\n¿Opción? ");
			int opcion = entrada.nextInt();

			switch (opcion) {

			case 1, 2, 3, 4, 5:
				System.out.println("\nHas elegido la opción " + opcion);
			}
		}

	}

	private static void mostrarPresentacion() {
		
		System.out.println("#################################################################################");
		System.out.println("#\t\t\tBIBLIOTECA DEL IES SON FERRER\t\t\t\t#");
		System.out.println("#\t\t\t   BASE DE DATOS DE LIBROS     \t\t\t\t#");
		System.out.println("#################################################################################");
		
	}

}