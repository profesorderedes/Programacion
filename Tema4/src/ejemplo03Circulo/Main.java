package ejemplo03Circulo;

public class Main {

	public static void main(String[] args) {

		Circulo circulo1 = new Circulo();

		circulo1.x = 0;
		circulo1.y = 0;
		circulo1.radio = 10;
		circulo1.color = "azul";

		circulo1.mostrar();

		System.out.println("Área del círculo 1: " + circulo1.area());
		System.out.println("Perímetro del círculo 1: " + circulo1.perimetro());

		Circulo circulo2 = new Circulo();

		circulo2.mostrar();

	}

}
