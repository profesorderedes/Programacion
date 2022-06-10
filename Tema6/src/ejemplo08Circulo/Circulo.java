package ejemplo08Circulo;

public class Circulo implements Figura2D, Mostrable {

	private int radio;
	private int x, y;
	private String color;

	public Circulo(int radio, int x, int y, String color) {
		this.radio = radio;
		this.x = x;
		this.y = y;
		this.color = color;
	}

	@Override
	public double area() {

		return Math.PI * radio * radio;

	}

	@Override
	public double perimetro() {

		return 2 * Math.PI * radio;

	}

	@Override
	public void mostrar() {

		System.out.println("Radio = " + radio);
		System.out.println("Coordenadas = (" + x + ", " + y + ")");
		System.out.println("Color = " + color);

	}

}
