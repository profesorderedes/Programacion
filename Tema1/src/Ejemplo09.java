
public class Ejemplo09 {

	public static void main(String[] args) {

		int asistentes = 5000;

		// Conversión implícita
		long personas = asistentes;

		System.out.println(personas);

		// Conversión implícita
		float gente = personas;

		System.out.println(gente);

		// Conversión explícita
		long jugadores = 1000;

		int players = (int) jugadores;

		System.out.println(players);

		// Conversión explícita
		double precio = 2300.50;

		float precio2 = (float) precio;

	}

}
