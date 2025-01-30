package geometria;

public class Cilindro {

	private int altura;
	private int radio;
	private final double PI = 3.141592;

	public Cilindro() {

	}

	public Cilindro(int altura, int radio) {

		this.altura = altura;
		this.radio = radio;

	}

	public double getArea() {

		double area = 2 * PI * radio * altura + 2 * PI * (radio * radio);
		return area;

	}

	public double getVolumen() {

		double volumen = PI * (radio * radio) * altura;
		return volumen;

	}

	public String toString() {

		return "Altura: " + altura + "\nRadio: " + radio;

	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
}