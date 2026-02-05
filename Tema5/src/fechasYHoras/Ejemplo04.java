package fechasYHoras;

import java.time.LocalDate;

public class Ejemplo04 {

	public static void main(String[] args) {

		LocalDate fecha = LocalDate.parse("2024-05-16");
		LocalDate fecha2 = LocalDate.parse("2024-06-16");

		System.out.println(fecha.isBefore(fecha2));
		System.out.println(fecha.isEqual(fecha2));
		System.out.println(fecha.isAfter(fecha2));

	}

}
