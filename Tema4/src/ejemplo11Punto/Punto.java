package ejemplo11Punto;

public class Punto {

	// Atributos de la clase Punto.

	private int x;
	private int y;
	private String color;

	// Métodos de la clase Punto.

	public Punto(int x, int y, String color) {

		this.x = x;
		this.y = y;
		this.color = color;

	}

	public Punto(int x, int y) {

		this(x, y, "negro");

	}

	public void mostrar() {

		System.out.println("\nx=" + x + ", y=" + y + ", color=" + color);

	}

	public void moverX(int dx) {
		x = x + dx;
	}

	public void moverY(int dy) {
		y = y + dy;
	}

	public void moverXY(int dx, int dy) {
		moverX(dx);
		moverY(dy);
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
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
