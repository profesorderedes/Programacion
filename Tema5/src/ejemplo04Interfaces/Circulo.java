package ejemplo04Interfaces;

public class Circulo implements Figura2D, Mostrable {

	private int x;
	private int y;
	private int radio;
	
	public Circulo(int x, int y, int radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
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
		System.out.println("Círculo de radio " + radio);		
	}

}
