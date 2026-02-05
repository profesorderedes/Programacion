package fechasYHoras;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ejemplo01 {

	public static void main(String[] args) {

		LocalDate fecha = LocalDate.parse("1980-02-01");
		System.out.println(fecha);

		LocalDate fecha2 = LocalDate.of(1980, 2, 1);
		System.out.println(fecha2);

		LocalTime hora = LocalTime.parse("13:40:05");
		System.out.println(hora);

		LocalTime hora2 = LocalTime.of(13, 40, 5);
		System.out.println(hora2);

		// Fecha y hora actual.

		LocalDate fechaActual = LocalDate.now();
		System.out.println(fechaActual);

		LocalTime tiempoActual = LocalTime.now();
		System.out.println(tiempoActual);

	}

}
