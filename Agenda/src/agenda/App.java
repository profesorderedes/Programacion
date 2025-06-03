package agenda;

import java.util.Scanner;

import net.iessonferrer.io.Consola;

public class App {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		Agenda agenda = new Agenda(100);

		menuPrincipal(agenda);

		System.out.println("\nGracias por usar la agenda.");

	}

	private static void mostrarCabecera() {

		System.out.println("***************************************************************************************");
		System.out.println("*                                                                                     *");
		System.out.println("*                                 AGENDA TELEFÓNICA                                   *");
		System.out.println("*                                                                                     *");
		System.out.println("*                                    Por: Carlos                                      *");
		System.out.println("*                                                                                     *");
		System.out.println("***************************************************************************************");

	}

	private static void borrarPantalla() {
//		for (int i = 1; i <= 50; i++) {
//			System.out.println();
//		}
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	private static void menuPrincipal(Agenda agenda) {

		int opcion;

		do {

			borrarPantalla();

			mostrarCabecera();

			System.out.println("\nMENÚ PRINCIPAL - AGENDA TELEFÓNICA");
			System.out
					.println("=======================================================================================");

			System.out.println();
			System.out.println(" (1) Ver todos los contactos");
			System.out.println(" (2) Añadir un contacto");
			System.out.println(" (3) Editar un contacto");
			System.out.println(" (4) Borrar un contacto");
			System.out.println(" (5) Salir");

			System.out.print("\n> ");

			opcion = Consola.leerInt("Tiene que escribir un número entre 1 y 5.");

			while (opcion < 1 || opcion > 5) {
				System.out.println("Tiene que escribir un número entre 1 y 5.");
				opcion = Consola.leerInt();
			}

			switch (opcion) {
			case 1:
				menuVerContactos(agenda);
				break;
			case 2:
				menuAnyadirContacto(agenda);
				break;
			case 3:
				menuEditarContacto(agenda);
				break;
			case 4:
				menuBorrarContacto(agenda);
				break;
			}

		} while (opcion != 5);

	}

	private static void menuVerContactos(Agenda agenda) {

		borrarPantalla();

		System.out.println("\nCONTACTOS - AGENDA TELEFÓNICA");
		System.out.println("=======================================================================================");

		agenda.listarContactos();

		System.out.println("\nPulse INTRO para volver al menú principal...");
		entrada.nextLine();

	}

	private static void menuAnyadirContacto(Agenda agenda) {

		borrarPantalla();

		System.out.println("\nAÑADIR CONTACTO - AGENDA TELEFÓNICA");
		System.out.println("=======================================================================================");

		// Leemos los datos del próximo contacto.
		Contacto contactoNuevo = leerDatosContacto();

		if (contactoNuevo != null) {
			agenda.anyadirContacto(contactoNuevo);
			System.out.println("\nSe ha añadido el contacto a la agenda.");
		} else {
			System.out.println("\nNo se ha añadido el contacto a la agenda.");
		}

		System.out.println("\nPulse INTRO para volver al menú principal...");
		entrada.nextLine();

	}

	private static Contacto leerDatosContacto() {

		// Leemos los datos del contacto (menos el id, que se le asigna
		// automáticamente).

		System.out.print("\nApellidos del contacto: ");
		String apellidos = Consola.leerString();

		System.out.print("Nombre del contacto: ");
		String nombre = Consola.leerString();

		System.out.print("Teléfono del contacto: ");
		String tel = Consola.leerString();

		// Pedimos confirmación para dar por bueno el contacto nuevo.

		System.out.println("\n¿Confirma que los datos del contacto son correctos (s/n)?");
		String confirma = Consola.leerString();

		if (confirma.equalsIgnoreCase("s")) {
			return new Contacto(apellidos, nombre, tel);
		} else {
			return null;
		}

	}

	private static void menuEditarContacto(Agenda agenda) {

		borrarPantalla();

		System.out.println("\nEDITAR CONTACTO - AGENDA TELEFÓNICA");
		System.out.println("=======================================================================================");

		System.out.print("Id del contacto que desea modificar: ");
		int id = Consola.leerInt("Tiene que escribir un número entero. Vuelva a hacerlo.");

		int pos = agenda.buscarContacto(id);

		if (pos == -1) {
			System.out.println("\nNo existe ningún contacto con el id indicado.");
			System.out.println("\nPulse INTRO para volver al menú principal...");
			entrada.nextLine();
			return;
		}

		Contacto contactoAntiguo = agenda.getContacto(pos);

		System.out.println("\nLos datos del contacto elegido son:\n" + contactoAntiguo);
		System.out.println("\nEscriba los nuevos datos del contacto:");

		Contacto contactoEditar = leerDatosContacto();

		if (contactoEditar != null) {
			contactoEditar.setId(contactoAntiguo.getId());
			agenda.setContacto(pos, contactoEditar);
			System.out.println("\nSe ha modificado el contacto en la agenda.");
		} else {
			System.out.println("\nNo se ha modificado el contacto en la agenda.");
		}

		System.out.println("\nPulse INTRO para volver al menú principal...");
		entrada.nextLine();

	}

	private static void menuBorrarContacto(Agenda agenda) {

		borrarPantalla();

		System.out.println("\nBORRAR CONTACTO - AGENDA TELEFÓNICA");
		System.out.println("=======================================================================================");

		System.out.print("Id del contacto que desea eliminar: ");
		int id = Consola.leerInt("Tiene que escribir un número entero. Vuelva a hacerlo.");

		int pos = agenda.buscarContacto(id);

		if (pos == -1) {
			System.out.println("\nNo existe ningún contacto con el id indicado.");
			System.out.println("\nPulse INTRO para volver al menú principal...");
			entrada.nextLine();
			return;
		}

		Contacto contacto = agenda.getContacto(pos);

		System.out.println("\nLos datos del contacto elegido son:\n" + contacto);

		System.out.println("\n¿Está seguro de querer eliminarlo de la agenda (s/n)?");
		String confirma = entrada.nextLine();

		if (confirma.equalsIgnoreCase("s")) {
			agenda.eliminarContacto(id);
			System.out.println("\nSe ha eliminado el contacto.");
		} else {
			System.out.println("\nNo se ha eliminado el contacto.");
		}

		System.out.println("\nPulse INTRO para volver al menú principal...");
		entrada.nextLine();

	}

}
