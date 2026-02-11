package prac2;

public class Condensador extends Componente {

	private double capacidad;

	public Condensador(double intensidadMaxima, double longitud, double capacidad) {

		super(intensidadMaxima, longitud);
		this.capacidad = capacidad;

	}

	@Override
	public void conectar() {
		System.out.println("Componente conectado.");
	}

}
