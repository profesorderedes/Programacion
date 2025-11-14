package hoja2;

public class Ejer07 {

	public static void main(String[] args) {

		String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		int[] espectadores = { 2000000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000 };
		int posMin = 0, posMax = 0;

		for (int i = 1; i < espectadores.length; i++) {
			if (espectadores[i] < espectadores[posMin]) {
				posMin = i;
			} else if (espectadores[i] > espectadores[posMax]) {
				posMax = i;
			}

		}

		System.out.println("La audiencia mínima de la semana fue el " + dias[posMin] + " con un total de: "
				+ espectadores[posMin] + " espectadores.");
		System.out.println("La audiencia máxima de la semana fue el " + dias[posMax] + " con un total de: "
				+ espectadores[posMax] + " espectadores.");

	}

}