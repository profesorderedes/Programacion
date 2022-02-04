package ejemplo09;

public class Circulo {

	// Atributos
	int x;
	int y;
	int radio;
	String color;

	// Constructores

	Circulo(){
		
	}
	// Firma -> Circulo()
	
	Circulo(int radio){
		x = 0;
		y = 0;
		this.radio = radio;
		color = "Negro";
	}
	// Firma -> Circulo(int)
	
	Circulo(String color){
		this.color = color;
	}
	// Firma -> Circulo(String)
	
	Circulo(int x){
		this.x = x;
	}
	
	Circulo(int x, int y, int radio, String color) {

		this.x = x;
		this.y = y;
		this.radio = radio;
		this.color = color;
		
	}
	// Firma -> Circulo(int, int, int, String)

	// Métodos
	void mostrar() {

		System.out.println("\nX: " + x);
		System.out.println("Y: " + y);
		System.out.println("Radio: " + radio);
		System.out.println("Color: " + color);

	}

	double area() {

		return Math.PI * radio * radio;

	}

	double perimetro() {

		return 2 * Math.PI * radio;

	}

}
