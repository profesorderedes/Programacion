package net.iessonferrer.mates;

public class Mates {

	// Recibe un número decimal y lo devuelve redondeado a dos decimales.
	public static double redondear(double num) {

		return Math.round(num * 100) / 100.0;

	}

	// Recibe un número decimal y la cantidad de cifras a la que queremos
	// redondear. Devuelve el número redondeado.
	public static double redondear(double num, int decimales) {

		// Para redondear a un número de decimales hay que multiplicar
		// y dividir por 10 elevado a ese número.
		double multiplo = Math.pow(10, decimales);

		return Math.round(num * multiplo) / multiplo;

	}

}
