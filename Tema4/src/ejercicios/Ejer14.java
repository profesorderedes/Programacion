package ejercicios;

public class Ejer14 {

	public static void main(String[] args) {

		String[] planetas = { "Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno",
				"Plutón" };

		System.out.println("El planeta está en la posición: " + posPlaneta(planetas, "Luna"));

	}

	static int posPlaneta(String[] planetas, String nombrePlaneta) {

		for (int i = 0; i < planetas.length; i++) {

			if (planetas[i].equals(nombrePlaneta)) {
				return i;
			}

		}

		return -1;

	}

}