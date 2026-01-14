package ejemplo12Circulo;

public class Circulo {

	private int x;
	private int y;
	private int radio;
	private String color;

	public Circulo(int x, int y, int radio, String color) {

		this.x = x;
		this.y = y;
		this.radio = radio;
		this.color = color;

	}

	public Circulo(int radio) {

		this(0, 0, radio, "negro");

	}

	public void mostrar() {

		System.out.println("\nx = " + x);
		System.out.println("y = " + y);
		System.out.println("radio = " + radio);
		System.out.println("color = " + color);

	}

	public double area() {
		return Math.PI * radio * radio;
	}

	public double perimetro() {
		return 2 * Math.PI * radio;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
