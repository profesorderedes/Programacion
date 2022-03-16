package actividad2;

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

        System.out.print("Tensión inversa: ");
        tensionInversa = entrada.nextDouble();

        System.out.print("Intensidad máxima: ");
        double intensidadMaxima = entrada.nextDouble();
        setIntensidadMaxima(intensidadMaxima);

        System.out.print("Longitud: ");
        double longitud = entrada.nextDouble();
        setLongitud(longitud);
        

       

    }

}
