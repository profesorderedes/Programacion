package ejemplo04Rectangulo;

public class Rectangulo {

	int x, y; // Coordenadas del vértice superior izquierdo
	int base, altura;
	String color;

	void mostrar() {

		System.out.println("\nCoordenadas: (" + x + ", " + y + ")");
		System.out.println("Dimensiones: " + base + " x " + altura);
		System.out.println("Color: " + color);

	}

	double area() {
		return base * altura;
	}

	double perimetro() {
		return 2 * base + 2 * altura;
	}

	void desplazar(int dx, int dy) {

		x = x + dx;
		y = y + dy;

	}
	
	// Recibe las coordenadas (a,b) de un punto y nos dice si ese 
	// punto está dentro del rectángulo.
	boolean contiene(int a, int b) {
		
		if(a > x && a < x + base && b > y && b < y + altura) {
			return true;
		}
		
		return false;
		
	}

}


















