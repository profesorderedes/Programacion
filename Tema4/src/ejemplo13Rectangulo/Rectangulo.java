package ejemplo13Rectangulo;

public class Rectangulo {

	// Vértice superior izquierdo del rectángulo.
	private int x, y;
	private int base, altura;
	private String color;

	public Rectangulo(int x, int y, int base, int altura, String color) {

		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
		this.color = color;

	}

	public Rectangulo(int base, int altura, String color) {

		this(0, 0, base, altura, color);

	}

	public Rectangulo(int base, int altura) {

		this(0, 0, base, altura, "negro");

	}

	public void mostrar() {

		System.out.println("\nx = " + x);
		System.out.println("y = " + y);
		System.out.println("base = " + base);
		System.out.println("altura = " + altura);
		System.out.println("color = " + color);

	}

	public void mover(int dx, int dy) {

		x = x + dx;
		y = y + dy;

	}

	public boolean contiene(int a, int b) {

		if (a >= x && a <= x + base && b >= y && b <= y + altura) {
			return true;
		}

		return false;

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

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
