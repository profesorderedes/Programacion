package ejemplo13Circulo;

public class Main {

	public static void main(String[] args) {

		Circulo circulo1 = new Circulo(10, 20, 5, "Azul");
		circulo1.mostrar();

		Circulo circulo2 = new Circulo();
		circulo2.x = 20;
		circulo2.mostrar();

		Circulo circulo3 = new Circulo(20);
		circulo3.mostrar();

		Circulo circulo4 = new Circulo("Violeta");
		circulo4.mostrar();

	}

}
