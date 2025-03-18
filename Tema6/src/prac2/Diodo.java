package prac2;

public class Diodo extends Componente {

	private double tensionInversa;

	public Diodo(double intensidadMaxima, double longitud, double tensionInversa) {
		
		super(intensidadMaxima, longitud);
		this.tensionInversa = tensionInversa;
		
	}

}
