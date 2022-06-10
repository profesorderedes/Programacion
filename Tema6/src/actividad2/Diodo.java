package actividad2;

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

		System.out.println("Datos del diodo:\n==============================");

		try {

			System.out.println("Intensidad máxima: ");
			setIntensidadMaxima(entrada.nextDouble());

			System.out.println("Longitud: ");
			setLongitud(entrada.nextDouble());

			System.out.println("Tensión inversa: ");
			tensionInversa = entrada.nextDouble();

		} catch (InputMismatchException ex) {

			System.out.println("Entrada incorrecta. " + "Sólo se aceptan valores númericos.");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Fin de lectura de datos.");
		}

	}

}
