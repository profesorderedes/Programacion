package ejercicios;

public class Ejer02 {

	public static void main(String[] args) {

		String saludo = saludar("Jaume", 22);

		System.out.println(saludo);

	}

	static String saludar(String nombre, int edad) {

		return "Hola, " + nombre + " no parece que tengas " + edad + " años.";

	}

}
