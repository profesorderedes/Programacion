package ejercicios;

public class Ejer07 {

	public static void main(String[] args) {

		System.out.println(decimalAlCubo(6.9));

	}

	static double decimalAlCubo(double num) {

		double resultado = Math.pow(num, 3);

		return resultado;

	}

}