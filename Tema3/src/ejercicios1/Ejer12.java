package ejercicios1;

public class Ejer12 {

	public static void main(String[] args) {

		String matriculas[] = new String[100];

		System.out.println("Inicializando matrículas...");
		for (int i = 0; i < matriculas.length; i++) {
			matriculas[i] = "sinmatricula";
		}

		System.out.println("\nMostrando valores guardados...");
		for (int i = 0; i < matriculas.length; i++) {
			System.out.println(i + " " + matriculas[i]);
		}

	}

}
