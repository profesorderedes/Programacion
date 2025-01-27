package miscelanea;

public class RedondearNumeros {

	public static void main(String[] args) {

		double edadMedia = 40.78286182;

		System.out.println(edadMedia);

		// Podemos elegir el número de decimales con que se muestra
		// usando printf.
		System.out.printf("Edad media: %.1f\n", edadMedia);

		// Podemos redondearlo usando Math.round().
		System.out.println(Math.round(edadMedia));

		System.out.println(redondear(edadMedia, 4));
		System.out.println(redondear(edadMedia));

	}

	// Recibe un número decimal y lo devuelve redondeado a dos decimales.
	static double redondear(double num) {

		return Math.round(num * 100) / 100.0;

	}

	// Recibe un número decimal y la cantidad de cifras a la que queremos
	// redondear. Devuelve el número redondeado.
	static double redondear(double num, int decimales) {

		// Para redondear a un número de decimales hay que multiplicar
		// y dividir por 10 elevado a ese número.
		double multiplo = Math.pow(10, decimales);

		return Math.round(num * multiplo) / multiplo;

	}

}



