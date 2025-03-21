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
		double intensidadMaxima;
		double longitud;
		double tensionInversa;

		try {

			System.out.println("Introduzca la intensidad máxima:");
			intensidadMaxima = entrada.nextDouble();

			System.out.println("Introduzca la longitud:");
			longitud = entrada.nextDouble();

			System.out.println("Introduzca la tensión inversa:");
			tensionInversa = entrada.nextDouble();

		} catch (InputMismatchException ime) {

			System.out.println("Entrada incorrecta");
			return;

		} catch(Exception e) {
			System.out.println("Error al leer los datos del diodo.");
			e.printStackTrace();
			return;
		} finally {
			System.out.println("Fin de lectura de datos.");
		}

		setIntensidadMaxima(intensidadMaxima);
		setLongitud(longitud);
		this.tensionInversa = tensionInversa;

	}

}
