package ejemplos;

// Métodos que devuelven un valor (no son void).

public class Ejemplo04 {
	
	public static void main(String[] args) {
		
		int resultado = doble(15);
		System.out.println("El resultado ha sido " + resultado + ".");
		
		System.out.println("El resultado ha sido " + doble(15) + ".");
		
		System.out.println("El triple de " + 5 + " es " + triple(5) + ".");
		
	}
	
	// Método que recibe un número y devuelve el doble del mismo.
	static int doble(int num) {
		System.out.println("Calculando el doble de " + num + "...");
		return num * 2;
	}
	
	// triple(num)
	static int triple(int num) {
		
		int triple = num * 3;
		return triple;
		
	}
	
	// Método que recibe una palabra como argumento y devuelve la inicial.
	// inicial(palabra) 
	
	// Método que recibe el radio de un círculo como argumento y devuelve el 
	// área de ese círculo.
	// areaCirculo(r)
	
	// Método que recibe el radio de una esfera como argumento y devuelve el 
	// volumen de esa esfera.
	// volumenEsfera(r)
	
	// Método que recibe un precio, el descuento a aplicar y el iva a aplicar y
	// devuelve el precio final.
	// precioVenta(precio, descuento, iva)
	
	// Método que devuelve el área de un triángulo tras recibir como parámetros
	// su base y su altura.
	// areaTriangulo(base, altura)
	
	

}





