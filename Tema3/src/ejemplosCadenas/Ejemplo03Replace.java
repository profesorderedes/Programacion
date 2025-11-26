package ejemplosCadenas;

public class Ejemplo03Replace {

	public static void main(String[] args) {

		String dicho = "El perro promedio es mejor persona que la persona promedio.";

		String nuevoDicho = dicho.replace("perro", "gato");

		System.out.println(nuevoDicho);
		
		System.out.println("Frase original: " + dicho);

	}

}
