package ejemplo06;

public class Main {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo();

//		r1.x = 20;
		r1.y = 50;
		r1.base = 40;
		r1.altura = 10;
		r1.color = "Rojo";

		r1.mostrar();

		System.out.println("Área: " + r1.area());
		System.out.println("Perímetro: " + r1.perimetro());

//		r1.desplazar(30, 5);
//		r1.mostrar();

		System.out.println(r1.estaDentro(45, 55));
		System.out.println(r1.estaDentro(100, 100));

	}

}
