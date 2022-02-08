package ejemplo12Punto;

public class Punto {

	// Atributos
	int x;
	int y;
	String color;
	
	//Constructores
	Punto(){
		
	}
	
	// Deja la x y la y con valor 0.
	Punto(String color){
		this()
	}
	
	// Dejará el color con valor "Negro".
	Punto(int x, int y){
		
	}
	
	
	
	Punto(int x, int y, String color){

		this.x = x;
		this.y = y;
		this.color = color;
		
	}

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








