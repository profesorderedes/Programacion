package ejemplo08Circulo;

public class Cuadrado implements Figura2D {

	private int lado;
	private int x, y;
	private String color;

	public Cuadrado(int lado, int x, int y, String color) {
		super();
		this.lado = lado;
		this.x = x;
		this.y = y;
		this.color = color;
	}

	@Override
	public double area() {
		return lado * lado;
	}

	@Override
	public double perimetro() {
		return 4 * lado;
	}

}
