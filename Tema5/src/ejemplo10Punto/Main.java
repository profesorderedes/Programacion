package ejemplo10Punto;

public class Main {

	public static void main(String[] args) {

		// Creamos un objeto de tipo Punto y le damos valores.
		Punto p1 = new Punto(0, 0, "azul");
		p1.mostrar();

		p1.setX(1000);
		System.out.println("\nEl valor de x es " + p1.getX());

	}

}
