package fechasYHoras;

import java.time.LocalTime;

public class Ejemplo03 {

	public static void main(String[] args) {

		LocalTime hora = LocalTime.now();

		System.out.println(hora);
		System.out.println("Hora: " + hora.getHour());
		System.out.println("Minuto: " + hora.getMinute());
		System.out.println("Segundo: " + hora.getSecond());
		System.out.println("Nanosegundos: " + hora.getNano());

		System.out.println("\nHora formateada: " + formatearHora(hora));

	}

	// hh:mm
	private static String formatearHora(LocalTime hora) {
		
		if() {
			return hora.getHour() + ":0" + hora.getMinute();
		}

		return hora.getHour() + ":" + hora.getMinute();
		
	}

}




