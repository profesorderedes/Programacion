package gestionGastos;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * Programa para gestionar gastos personales. Se puede guardar cada gasto. Se
 * pueden añadir los ingresos y sacar a fin de mes un resumen de gastos y un
 * balance. Todos los datos se pueden editar y borrar.
 */
public class GestionGastos {

	private static Scanner entrada = new Scanner(System.in);
	private static Libro libro;

	public static void main(String[] args) {

		libro = new Libro();

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

		Asiento nuevoAsiento = leerAsiento();

		// Pedimos confirmación al usuario antes de guardar los datos.
		System.out.print("\n¿Confirma que desea guardar este asiento (s/n)? ");
		String respuesta = entrada.nextLine();

		if (!respuesta.toLowerCase().equals("s")) {
			System.out.println("No se ha añadido este asiento.");
			return;
		}

		boolean asientoAnyadido = libro.nuevoAsiento(nuevoAsiento);

		if (asientoAnyadido && nuevoAsiento.getCantidad() < 0) {
			System.out.println("Se ha añadido este gasto.");
		} else if (asientoAnyadido && nuevoAsiento.getCantidad() > 0) {
			System.out.println("Se ha añadido este ingreso.");
		} else {
			System.out.println("No se ha podido añadir el asiento, no queda espacio en el libro.");
		}

	}

	private static Asiento leerAsiento() {

		System.out.print("\nFecha (en formato dd-mm-aaaa) (ENTER para la fecha de hoy): ");
		LocalDate fecha = leerFecha();

		System.out.print("Concepto: ");
		String concepto = Consola.leerString();

		System.out.print("Cantidad: ");
		double cantidad = Consola.leerDouble();

		while (cantidad == 0) {
			System.out.println("La cantidad no puede ser cero.");
			System.out.print("Cantidad: ");
			cantidad = Consola.leerDouble();
		}

		return new Asiento(fecha, concepto, cantidad);

	}

	/**
	 * Lee una fecha desde la terminal, en formato dd-mm-aaaa. En caso de que el
	 * usuario no escriba nada, toma como fecha la de hoy. Repite la pregunta
	 * mientras el usuario no escriba una entrada válida.
	 * 
	 * @return La fecha leída desde la terminal, como objeto LocalDate.
	 */
	private static LocalDate leerFecha() {

		String fechaString = entrada.nextLine();

		// Como valor por defecto tomamos la fecha de hoy.
		LocalDate fecha = LocalDate.now();

		boolean fechaCorrecta = false;

		do {

			try {

				if (!fechaString.equals("")) {

					// Creamos una fecha con formato aaaa-mm-dd.
					String[] campos = fechaString.split("-");
					String fechaCorregida = campos[2] + "-" + campos[1] + "-" + campos[0];

					fecha = LocalDate.parse(fechaCorregida);

				}

				fechaCorrecta = true;

			} catch (ArrayIndexOutOfBoundsException | DateTimeParseException ex) {

				System.out.println("La fecha escrita no es válida.");
				System.out.print("\nFecha (en formato dd-mm-aaaa) (ENTER para la fecha de hoy): ");
				fechaString = entrada.nextLine();
			}

		} while (!fechaCorrecta);

		return fecha;

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
