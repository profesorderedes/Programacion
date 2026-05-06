package ejemplos;

public class Ejemplo13 {

	public static void main(String[] args) {

		System.out.println(exclamar("hola"));
		System.out.println(exclamar(100));
	}

	public static <T> T exclamar(T frase) {
		return frase;
	}

}
