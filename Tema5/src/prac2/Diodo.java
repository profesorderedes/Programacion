package prac2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diodo extends Componente {

	private double tensionInversa;

	public Diodo(double intensidadMaxima, double longitud, double tensionInversa) {

		super(intensidadMaxima, longitud);
		this.tensionInversa = tensionInversa;

	}

	@Override
	public void conectar() {
		System.out.println("Componente conectado.");
	}

	public void leeDatos() {

		Scanner entrada = new Scanner(System.in);

		try {

			// Leemos los datos del diodo.

			System.out.println("Introduce la intensidad máxima del Diodo: ");
			double iMax = entrada.nextDouble();

			System.out.println("Introduce la longitud del Diodo: ");
			double longitud = entrada.nextDouble();

			System.out.println("Introduce la tensión inversa del Diodo: ");
			double tensInv = entrada.nextDouble();

			// Si no se ha producido ningún error al leer los datos,
			// guardamos en los atributos.

			setIntensidadMaxima(iMax);
			setLongitud(longitud);
			tensionInversa = tensInv;

			// Podemos lanzar manualmente una excepción con throw.
			// throw new ArithmeticException();

		} catch (InputMismatchException e) {

			System.out.println("Entrada incorrecta.");
			return;

		} catch (Exception e) {

			e.printStackTrace();
			return;

		} finally {

			System.out.println("Fin de lectura de datos");

		}

	}

	public double getTensionInversa() {
		return tensionInversa;
	}

	public void setTensionInversa(double tensionInversa) {
		this.tensionInversa = tensionInversa;
	}
}
