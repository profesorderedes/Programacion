package gestionGastos;

import java.time.LocalDate;

public class Libro {

	private final int MAX_ASIENTOS = 100;

	private Asiento[] asientos;
	private int finAsientos;
	private int idSiguiente;

	/**
	 * Constructor de la clase.
	 */
	public Libro() {

		asientos = new Asiento[MAX_ASIENTOS];
		finAsientos = 0;
		idSiguiente = 1;

	}

	/**
	 * Añade un nuevo asiento al array asientos.
	 * 
	 * @param asiento Asiento que se quiere añadir al array asientos.
	 * @return true si se ha podido añadir o false si no se ha podido porque no
	 *         quedaba espacio en el array.
	 */
	public boolean nuevoAsiento(Asiento asiento) {

		// Comprobamos que haya sitio.
		if (finAsientos == MAX_ASIENTOS) {
			return false;
		}

		asiento.setId(idSiguiente);

		asientos[finAsientos] = asiento;

		finAsientos++;
		idSiguiente++;

		return true;

	}

	/**
	 * Muestra en la terminal el balance de un mes.
	 * 
	 * @param fecha Fecha de la cual se extraerá el mes y el año para mostrar los
	 *              asientos de ese mes y año.
	 */
	public void mostrarBalanceMes(LocalDate fecha) {

		int anyo = fecha.getYear();
		int mes = fecha.getMonthValue();

		double gastos = 0, ingresos = 0;

		ordenarAsientos();

		System.out.println("\nMostrando el balance de " + nombreMes(mes) + " de " + anyo + ":\n");

		System.out.printf("%-10s  %-30s  %8s\n", "Fecha", "Concepto", "Cantidad (€)");
		System.out.printf("%-10s  %-30s  %8s\n", "==========", "==============================", "============");

		for (int i = 0; i < finAsientos; i++) {

			if (asientos[i].getDia().getYear() == anyo && asientos[i].getDia().getMonthValue() == mes) {

				System.out.println(asientos[i].toString());

				if (asientos[i].getCantidad() < 0) {
					gastos = gastos + asientos[i].getCantidad();
				} else {
					ingresos = ingresos + asientos[i].getCantidad();
				}
			}

		}

		System.out.printf("\n%9s %9.2f %s\n", "Ingresos:", ingresos, "€");
		System.out.printf("%9s %9.2f %s\n", "Gastos:", gastos, "€");

	}

	/**
	 * Muestra en la terminal el balance de un año.
	 * 
	 * @param fecha Fecha de la cual se extraerá el año para mostrar los asientos de
	 *              ese año.
	 */
	public void mostrarBalanceAnyo(LocalDate fecha) {

		int anyo = fecha.getYear();

		double gastos = 0, ingresos = 0;

		ordenarAsientos();

		System.out.println("\nMostrando el balance del año " + anyo + ":\n");

		System.out.printf("%-10s  %-30s  %8s\n", "Fecha", "Concepto", "Cantidad (€)");
		System.out.printf("%-10s  %-30s  %8s\n", "==========", "==============================", "============");

		for (int i = 0; i < finAsientos; i++) {
			if (asientos[i].getDia().getYear() == anyo) {

				System.out.println(asientos[i].toString());

				if (asientos[i].getCantidad() < 0) {
					gastos = gastos + asientos[i].getCantidad();
				} else {
					ingresos = ingresos + asientos[i].getCantidad();
				}
			}
		}

		System.out.printf("\n%9s %9.2f %s\n", "Ingresos:", ingresos, "€");
		System.out.printf("%9s %9.2f %s\n", "Gastos:", gastos, "€");

	}

	private void ordenarAsientos() {

		int posMin;
		Asiento aux;
		LocalDate fechaJ, fechaPosMin;

		for (int i = 0; i < finAsientos - 1; i++) {

			posMin = i;
			for (int j = i + 1; j < finAsientos; j++) {

				fechaJ = asientos[j].getDia();
				fechaPosMin = asientos[posMin].getDia();

				if (fechaJ.isBefore(fechaPosMin)) {
					posMin = j;
				}
			}

			aux = asientos[i];
			asientos[i] = asientos[posMin];
			asientos[posMin] = aux;

		}

	}

	private String nombreMes(int mes) {

		String[] nombres = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre", };

		return nombres[mes - 1];

	}

	/**
	 * Muestra en la terminal los asientos correspondientes a una fecha dada.
	 * 
	 * @param fecha Fecha de la que queremos mostrar sus asientos.
	 */
	public void mostrarAsientosDia(LocalDate fecha) {

		System.out.println("\nMostrando los asientos del " + fecha.toString() + ":\n");

		System.out.printf("%5s  %-10s  %-30s  %8s\n", "ID", "Fecha", "Concepto", "Cantidad (€)");
		System.out.printf("%5s  %-10s  %-30s  %8s\n", "=====", "==========", "==============================",
				"============");

		for (int i = 0; i < finAsientos; i++) {

			if (asientos[i].getDia().isEqual(fecha)) {
				System.out.println(asientos[i].toStringConId());
			}
		}

	}

	/**
	 * Dado un id de un asiento, devuelve la posición en el array asientos de ese
	 * asiento.
	 * 
	 * @param id Id de un asiento.
	 * @return Posición del asiento que tiene ese id en el array asientos, o -1 si
	 *         no es encuentra.
	 */
	public int getPosAsientoPorId(int id) {

		for (int i = 0; i < finAsientos; i++) {

			if (asientos[i].getId() == id) {
				return i;
			}

		}

		return -1;
	}

	/**
	 * Devuelve al asiento ubicado en la posición pos del array asientos.
	 * 
	 * @param pos Posición del asiento en el array.
	 * @return Asiento contenido en esa posición, o null si no aparece.
	 */
	public Asiento getAsiento(int pos) {

		if (pos >= finAsientos) {
			return null;
		}

		return asientos[pos];

	}

}
