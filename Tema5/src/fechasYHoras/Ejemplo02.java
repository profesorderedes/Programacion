package fechasYHoras;

import java.time.LocalDate;

public class Ejemplo02 {

	public static void main(String[] args) {

		LocalDate fecha = LocalDate.now();

		System.out.println("Año: " + fecha.getYear());
		System.out.println("Mes: " + fecha.getMonthValue());
		System.out.println("Año: " + fecha.getDayOfMonth());

		System.out.println("\nFecha de hoy: " + formatearFecha(fecha));
		System.out.println("\nFecha de hoy: " + formatearFecha2(fecha));

	}

	private static String formatearFecha(LocalDate fecha) {

		return fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear();

	}

	private static String formatearFecha2(LocalDate fecha) {

		String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };

		// 5 de febrero de 2026
		return fecha.getDayOfMonth() + " de " + meses[fecha.getMonthValue() - 1] + " de " + fecha.getYear();

	}

}
