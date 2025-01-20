package ejemplo03;

public class Main {

	public static void main(String[] args) {

		Circulo circulo1 = new Circulo();

		circulo1.x = 3;
		circulo1.y = 2;
		circulo1.radio = 35;

		circulo1.mostrar();

		System.out.println("Area: " + circulo1.area());
		System.out.println("Perimetro: " + circulo1.perimetro());

	}
}
