package ejemplo03Circulo;

public class Main {

	public static void main(String[] args) {

		Circulo circulo1 = new Circulo();

		circulo1.leerPropiedades();

		circulo1.mostrar();

		System.out.println("Área: " + circulo1.area());
		System.out.println("Perímetro: " + circulo1.perimetro());

	}
}
