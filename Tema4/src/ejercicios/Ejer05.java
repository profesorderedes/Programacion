package ejercicios;

public class Ejer05 {

	public static void main(String[] args) {

		double decimal = 10.25;

		System.out.println(cubo(decimal));

	}

	static double cubo(double decimal) {

		return Math.pow(decimal, 3);

	}

}