package ejemplos;

public class Ejemplo14 {

	public static void main(String[] args) {

		// Nombre de motor - cilindrada.
		Pareja<String, Integer> motor = new Pareja<>("Motor ASZ", 1900);

		// Nombre de persona - profesión.
		Pareja<String, String> profesion = new Pareja<>("Juan Martínez", "Zapatero");

		motor.mostrar();
		profesion.mostrar();

		exclamar("hola", "adiós");
		exclamar(100, 200);
		exclamar("peso", 80);

	}

	public static <T, V> void exclamar(T frase, V otraFrase) {
		System.out.println("¡¡¡" + frase + "!!!");
		System.out.println("¡¡¡" + otraFrase + "!!!");
	}

}
