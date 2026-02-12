package ejemplo04Interfaces;

public class Rectangulo implements Figura2D {

	private int x;
	private int y;
	private int base;
	private int altura;

	@Override
	public double area() {
		return base * altura;
	}

	@Override
	public double perimetro() {
		return 2 * base + 2 * altura;
	}

}
