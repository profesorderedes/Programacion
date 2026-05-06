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

		// Datos de prueba
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-12-20"), "Bolígrafo Pilot tinta azul punta fina", -5));
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-12-23"), "Desayuno", -2.5));
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-12-20"), "Desayuno", -3.05));
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-12-15"), "Comida", -15));
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-11-01"), "Desayuno", -2.5));
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-09-01"), "Salario", 1400));
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-09-20"), "Cena", -25));
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-12-20"), "Salario", 1500));
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-12-20"), "Entrada cine", -10));

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

	/**
	 * Muestra el menú principal de la aplicación y devuelve la acción elegida por
	 * el usuario.
	 * 
	 * @return Acción Número entero que indica la acción elegida por el usuario.
	 */
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

	/**
	 * Solicita al usuario los datos de un nuevo asiento y lo añade al libro.
	 */
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

	/**
	 * Lee de la terminal los datos de un nuevo asiento y los devuelve encapsulados
	 * en un objeto Asiento.
	 * 
	 * @return Objeto Asiento con los datos leídos.
	 */
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

	/**
	 * Muestra el menú que permite elegir el tipo de balance que se quiere ver.
	 * Luego muestra dicho balance.
	 */
	private static void verBalance() {

		System.out.println("\n\n*************************************************");
		System.out.println("*                 VER BALANCE                   *");
		System.out.println("*************************************************");

		System.out.println("\nElija una opción:");
		System.out.println("  1) Balance mensual");
		System.out.println("  2) Balance anual");
		System.out.println("  3) Volver al menú principal");
		System.out.print("> ");

		int opcion = Consola.leerInt("Tiene que escribir un número entre 1 y 3. Vuelva a intentarlo.", 1, 3);

		switch (opcion) {
		case 1:
			verBalanceMes();
			break;
		case 2:
			verBalanceAnyo();
			break;
		case 3:
			return;
		}

		System.out.println("\nPulse una tecla para volver al menú principal...");
		entrada.nextLine();

	}

	/**
	 * Genera una cadena que representa la fecha indicada en los parámetros de la
	 * aplicación, en formato aaaa-mm-dd.
	 * 
	 * @param dia  Día del mes de la fecha que se quiere generar.
	 * @param mes  Número de mes de la fecha que se quiere generar.
	 * @param anyo Año de la fecha que se quiere obtener.
	 * @return Cadena de texto representando la fecha proporcionada en los
	 *         parámetros.
	 */
	private static String crearCadenaFecha(int dia, int mes, int anyo) {

		String cadenaFecha = "" + anyo + "-";
		cadenaFecha = cadenaFecha + (mes < 10 ? "0" + mes : "" + mes) + "-";
		cadenaFecha = cadenaFecha + (dia < 10 ? "0" + dia : "" + dia);

		return cadenaFecha;

	}

	/**
	 * Muestra el balance de un mes.
	 */
	private static void verBalanceMes() {

		System.out.print("\nIndique el mes: ");
		int mes = Consola.leerInt("Tiene que escribir un número entero. Vuelva a intentarlo.", 1, 12);

		System.out.print("Indique el año: ");
		int anyo = Consola.leerInt("Tiene que escribir un año válido (2000-3000). Vuelva a intentarlo.", 2000, 3000);

		String cadenaFecha = crearCadenaFecha(1, mes, anyo);

		try {
			libro.mostrarBalanceMes(LocalDate.parse(cadenaFecha));
		} catch (DateTimeParseException ex) {
			System.out.println("Se ha producido un error al parsear una fecha.");
		}

	}

	/**
	 * Muestra el balance de un año.
	 */
	private static void verBalanceAnyo() {

		System.out.print("\nIndique el año: ");
		int anyo = Consola.leerInt("Tiene que escribir un año válido (2000-3000). Vuelva a intentarlo.", 2000, 3000);

		String cadenaFecha = crearCadenaFecha(1, 1, anyo);

		libro.mostrarBalanceAnyo(LocalDate.parse(cadenaFecha));

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
