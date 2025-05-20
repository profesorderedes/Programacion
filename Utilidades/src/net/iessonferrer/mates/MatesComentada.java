package net.iessonferrer.mates;

/**
 * Clase que contiene métodos para redondear números decimales.
 * 
 * <p>
 * Uno de ellos se asegura de devolver el número con dos decimales mientras que
 * el otro devuelve la cantidad de decimales establecidos por el usuario.
 * 
 * @author David Fernández Pozo.
 * @version 0.1
 */
public class MatesComentada {

	/**
	 * Recibe un número y lo devuelve redondeado a 2 decimales.
	 * 
	 * @param num Número que se quiere redondear
	 * @return el número con dos decimales.
	 */
	public static double redondear(double num) {

		double nuevoNum = Math.round(num * 100) / 100.0;

		return nuevoNum;

	}

	/**
	 * Recibe un numero decimal y le indicamos a cuántas cifras lo queremos
	 * redondear.
	 * 
	 * @param num       número introducido por el usuario.
	 * @param decimales cantidad de decimales que queremos.
	 * @return el número definido por el usuario con la cantidad de decimales
	 *         anteriormente establecidos.
	 */
	public static double redondear(double num, int decimales) {

		// Para redondear a un número de decimales hay que multiplicar y dividir x10
		// elevado a ese numero

		double multiplo = Math.pow(10, decimales);

		return Math.round(num * multiplo) / multiplo;

	}

}
