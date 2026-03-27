package gestionGastos;

import java.time.LocalDate;

public class Libro {

	private final int MAX_ASIENTOS = 20;

	private Asiento[] asientos;
	private int finAsientos;
	private int idSiguiente;

	public Libro() {

		asientos = new Asiento[MAX_ASIENTOS];
		finAsientos = 0;
		idSiguiente = 1;

	}

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

	public void mostrarBalanceMes(LocalDate fecha) {

		int anyo = fecha.getYear();
		int mes = fecha.getMonthValue();

		double gastos = 0, ingresos = 0;

		// Falta la llamada a ordenarAsientos().

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

	private String nombreMes(int mes) {

		String[] nombres = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre", };

		return nombres[mes - 1];

	}

}
