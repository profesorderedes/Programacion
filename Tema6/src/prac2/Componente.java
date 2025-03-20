package prac2;

public abstract class Componente {

	private double intensidadMaxima;
	private double longitud;

	public Componente(double intensidadMaxima, double longitud) {

		this.intensidadMaxima = intensidadMaxima;
		this.longitud = longitud;

	}

	public abstract void conectar();

}
