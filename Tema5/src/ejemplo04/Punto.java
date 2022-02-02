package ejemplo04;

public class Punto {

	// Atributos
	int x;
	int y;
	String color;

	// Métodos
	void mostrar() {

		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("Color: " + color);

	}
	
	void desplazar(int dx) {
		
		x = x + dx;
		
	}

}








