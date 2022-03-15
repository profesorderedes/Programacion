package actividad2;

public class Led extends Diodo {
	private String color;

	public Led(double intensidadMaxima, double longitug, 
			double tensionInversa, String color) {
		super(intensidadMaxima, longitug, tensionInversa);
		this.color = color;
	}

}
