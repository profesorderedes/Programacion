package ejemplo04Rectangulo;

public class Main {

	public static void main(String[] args) {

		Rectangulo rect1 = new Rectangulo();

		rect1.x = 5;
		rect1.y = 7;
		rect1.base = 100;
		rect1.altura = 50;
		rect1.color = "magenta";

		rect1.mostrar();

		System.out.println("Área: " + rect1.area());
		System.out.println("Perímetro: " + rect1.perimetro());

	}

}
