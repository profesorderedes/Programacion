package ejemplo08Rectangulo;

public class Main {

	public static void main(String[] args) {

		Rectangulo rec1 = new Rectangulo();

		rec1.x = 50;
		rec1.y = 60;
		rec1.base = 40;
		rec1.altura = 20;
		rec1.color = "rojo";

		rec1.mostrar();

		// Movemos el rectángulo 100 posiciones a la derecha y 20 hacia abajo.
		rec1.mover(100, 20);

		rec1.mostrar();

		// Comprobamos si ciertos puntos están dentro de nuestro círculo:
		int a = 500, b = 10;
		if (rec1.contiene(a, b)) {
			System.out.println("\nEl punto (" + a + "," + b + ") está dentro del rectángulo.");
		} else {
			System.out.println("El punto (" + a + "," + b + ") está fuera del rectángulo.");
		}

		a = 170;
		b = 90;
		if (rec1.contiene(a, b)) {
			System.out.println("El punto (" + a + "," + b + ") está dentro del rectángulo.");
		} else {
			System.out.println("El punto (" + a + "," + b + ") está fuera del rectángulo.");
		}

	}

}
