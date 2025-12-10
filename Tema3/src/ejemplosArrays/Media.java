package ejemplosArrays;

// Programa que lee valores como argumentos por la terminal
// y muestra su media aritmética.
public class Media {

	public static void main(String[] args) {

		// Media 5 10 3
		// La media es 6
		//String[] args2 = { "5", "10", "3", "6" };

		double suma = 0;

		for (int i = 0; i < args.length; i++) {
			suma = suma + Double.parseDouble(args[i]);
		}

		System.out.println("La media es: " + suma / args.length);

	}
}
