package ejercicios;

public class Ejer04 {

	public static void main(String[] args) {

		double num = 5.5;

		System.out.println(cuadrado(num));

	}

	static double cuadrado(double num) {

		double cuadradoNum = Math.pow(num, 2);

		return cuadradoNum;

	}

}