package ejercicios;

public class Ejer02 {

	public static void main(String[] args) {

		int numero = 17;

		String binario = transforma(numero);

		System.out.println("El número " + numero + " en binario es: " + binario);

	}

	public static String transforma(int dato) {

		if (dato == 0) {
			return "0";
		}

		String binario = "";

		while (dato > 0) {

			int resto = dato % 2;
			binario = resto + binario;
			dato = dato / 2;

		}

		return binario;

	}

}