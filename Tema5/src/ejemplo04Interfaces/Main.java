package ejemplo04Interfaces;

public class Main {

	public static void main(String[] args) {

		// Si declaramos figura como de tipo Figura2D, se le podrá
		// asignar un objeto cuya clase implemente Figura2D.
		Figura2D figura1 = new Circulo(0, 0, 10);

		Figura2D figura2 = new Rectangulo(20, 40, 100, 30);

		System.out.println("Área del círculo: " + area(figura1));
		System.out.println("Área del rectángulo: " + area(figura2));

	}

	public static double area(Figura2D figura) {

		return figura.area();

	}

}
