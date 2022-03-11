package ejemplo08Circulo;

public class Circulo implements Figura2D {

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
		
		return 2* Math.PI * radio; 
		
	}

}
