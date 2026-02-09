package fechasYHoras;

import java.time.LocalTime;

public class Ejemplo05 {

	public static void main(String[] args) {

		LocalTime hora = LocalTime.parse("20:30");
		LocalTime hora2 = LocalTime.parse("20:35");

		System.out.println(hora.isBefore(hora2));
		System.out.println(hora.isAfter(hora2));

	}

}
