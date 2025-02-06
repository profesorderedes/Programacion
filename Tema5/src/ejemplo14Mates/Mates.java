package ejemplo14Mates;

public class Mates {

	// Devuelve la potencia base elevado a exponente.
	public static int elevar(int base, int exponente) {

		int potencia = base;
		for (int i = 1; i < exponente; i++) {
			potencia = potencia * base;
		}

		return potencia;

	}

	// Devuelve el mayor de los dos números recibidos como parámetros.
	public static int max(int a, int b) {

		if (a > b) {
			return a;
		}
		return b;

	}

}
