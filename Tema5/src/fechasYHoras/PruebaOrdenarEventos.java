package fechasYHoras;

import java.time.LocalDate;

public class PruebaOrdenarEventos {

	public static void main(String[] args) {

		Evento evento1 = new Evento(LocalDate.parse("1939-09-01"), "Empieza la segunda guerra mundial");
		Evento evento2 = new Evento(LocalDate.parse("1914-07-28"), "Empieza la primera guerra mundial");
		Evento evento3 = new Evento(LocalDate.parse("2001-09-11"), "Ataque a las torres gemelas");
		Evento evento4 = new Evento(LocalDate.parse("1936-07-17"), "Empieza la guerra civil");

		Evento[] eventos = { evento1, evento2, evento3, evento4 };

		ordenarEventos(eventos);

		for (int i = 0; i < eventos.length; i++) {
			System.out.println(eventos[i].toString());
		}

	}

	// Ordenar el array por fecha.
	public static void ordenarEventos(Evento[] eventos) {

		int posMin;
		Evento aux;

		for (int i = 0; i < eventos.length - 1; i++) {

			// Buscamos el mínimo del array entre la posición i y el final.
			posMin = i;
			for (int j = i + 1; j < eventos.length; j++) {

				if (eventos[j].getFecha().isBefore(eventos[posMin].getFecha())) {
					posMin = j;
				}

			}

			// Intercambiamos las posiciones i y posMin.
			aux = eventos[i];
			eventos[i] = eventos[posMin];
			eventos[posMin] = aux;

		}

	}

}
