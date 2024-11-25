package hoja2;

public class Ejer07 {
	public static void main(String[] args) {

		String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" };
		int[] espectadores = { 2000000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000 };
		
		int min = espectadores[0];
		int max = espectadores[0];

		String diaMin = "";
		String diaMax = "";
		
		for (int i = 0; i < espectadores.length; i++) {

			if (espectadores[i] < min) {

				min = espectadores[i];
				diaMin = dias[i];
			} else if (espectadores[i] > max) {

				max = espectadores[i];
				diaMax = dias[i];
			}
		}

		System.out.println("El día con menor audiencia es el " + diaMin + ", con un total de: " + min);
		System.out.println("El día con mayor audiencia es el " + diaMax + ", con un total de: " + max);
	}
}
