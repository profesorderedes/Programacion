package fechasYHoras;

import java.time.LocalDateTime;

public class Ejemplo06 {

	public static void main(String[] args) {

		LocalDateTime fechaYHora = LocalDateTime.parse("2024-10-13T18:25:30");
		System.out.println(fechaYHora);

		LocalDateTime fechaYHora2 = LocalDateTime.of(2024, 10, 13, 18, 25, 30);
		System.out.println(fechaYHora2);

		LocalDateTime fechaYHoraActual = LocalDateTime.parse("2026-02-06T18:09:05");
		System.out.println(formatear(fechaYHoraActual));

	}

	private static String formatear(LocalDateTime fechaYHora) {

		return "Fecha: " + fechaYHora.getDayOfMonth() + "/" + fechaYHora.getMonthValue() + "/" + fechaYHora.getYear()
				+ "\nHora: " + rellenarConCero(fechaYHora.getHour()) + ":" + rellenarConCero(fechaYHora.getMinute())
				+ ":" + rellenarConCero(fechaYHora.getSecond());

	}

	// 4 -> "04"
	// 12 -> "12"
	private static String rellenarConCero(int num) {

		if (num < 10) {
			return "0" + num;
		}
		return "" + num;

	}

}
