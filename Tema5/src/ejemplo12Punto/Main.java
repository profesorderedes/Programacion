package ejemplo12Punto;

public class Main {

	public static void main(String[] args) {

		Punto p1 = new Punto(10, 30, "Verde");

		p1.mostrar();

		Punto p2 = new Punto();
		p2.mostrar();

		Punto p3 = new Punto("Rojo");
		p3.mostrar();

		Punto p4 = new Punto(10, 15);
		p4.mostrar();

	}

}
