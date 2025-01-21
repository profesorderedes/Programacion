package ejemplo04Rectangulo;

public class Main {

	public static void main(String[] args) {

		Rectangulo rect1 = new Rectangulo();

//		rect1.x = 5;
		rect1.y = 7;
		rect1.base = 100;
		rect1.altura = 50;
		rect1.color = "magenta";

		rect1.mostrar();

		System.out.println("Área: " + rect1.area());
		System.out.println("Perímetro: " + rect1.perimetro());

		rect1.desplazar(5, 10);

		System.out.println(
				"Tras desplazar el rectángulo 5px a la derecha " + "\ny 10px hacia abajo, sus propiedades son:");
		rect1.mostrar();

		if (rect1.contiene(15, 40)) {
			System.out.println("El punto (15,40) está dentro del rectángulo.");
		} else {
			System.out.println("El punto (15,40) está fuera del rectángulo.");
		}

		if (rect1.contiene(1, 1)) {
			System.out.println("El punto (1,1) está dentro del rectángulo.");
		} else {
			System.out.println("El punto (1,1) está fuera del rectángulo.");
		}

	}

}
