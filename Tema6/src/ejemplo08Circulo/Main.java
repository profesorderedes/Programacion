package ejemplo08Circulo;

public class Main {

	public static void main(String[] args) {

		// Podemos declarar variables de tipo Figura2D.
		// Dentro de una variable de tipo Figura2D podemos
		// guardar un objeto de una clase que implemente
		// la interfaz Figura2D.
		Figura2D figura1 = new Circulo(10, 1, 5, "Verde");
		Figura2D figura2 = new Cuadrado(20, 0, 0, "Rojo");

		// Podemos llamar a los métodos de Circulo y Cuadrado
		// que estén en la interfaz Figura2D.
		System.out.println("Área del círculo: " + figura1.area());
		System.out.println("Área del cuadrado: " + figura2.area());

		Circulo circulo1 = new Circulo(5, 0, 0, "Azul");
		calcularArea(circulo1);
		calcularArea(figura1);
		calcularArea(figura2);

		System.out.println("\nMostrando los datos de circulo1:");
		circulo1.mostrar();

	}

	public static void calcularArea(Figura2D figura) {

		System.out.println("Área: " + figura.area());

	}

//	public static void calcularArea(Cuadrado cuadrado1) {
//		
//		System.out.println("Área: " + cuadrado1.area());
//		
//	}

}
