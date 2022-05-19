package biblioteca;


import java.util.Scanner;

public class App {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		mostrarPresentacion();

		while (true) {

			int opcion = menuPrincipal();

			switch (opcion) {
			case 1:
				System.out.println("\nHas elegido la opción 1");
				break;
			case 2:
				System.out.println("\nHas elegido la opción 2");
				break;
			case 3:
				System.out.println("\nHas elegido la opción 3");
				break;
			case 4:
				System.out.println("\nHas elegido la opción 4");
				break;
			case 5:
				System.out.println("\nHas elegido la opción 5");
				System.exit(0);
				break;
			}

		}

	}

	public static void mostrarPresentacion() {

		System.out.println("###################################################################################");
		System.out.println("#                          BIBLIOTECA DEL IES SON FERRER                          #");
		System.out.println("#                             BASE DE DATOS DE LIBROS                             #");
		System.out.println("###################################################################################");

	}

	public static int menuPrincipal() {

		System.out.println("\n\nMENÚ PRINCIPAL");
		System.out.println(
				"============================================================================================================");

		System.out.println("1) Introducir libro");
		System.out.println("2) Editar libro");
		System.out.println("3) Borrar libro");
		System.out.println("4) Ver todos los libros");
		System.out.println("5) Salir");
		System.out.print("\nOpción? ");

		int opcion = entrada.nextInt();

		return opcion;

	}

}
