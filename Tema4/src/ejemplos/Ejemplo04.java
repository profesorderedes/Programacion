package ejemplos;

// Métodos que devuelven un valor (no son void).

public class Ejemplo04 {
	
	public static void main(String[] args) {
		
		int resultado = doble(15);
		System.out.println("El resultado ha sido " + resultado + ".");
		
		System.out.println("El resultado ha sido " + doble(15) + ".");
		
	}
	
	// Método que recibe un número y devuelve el doble del mismo.
	static int doble(int num) {
		System.out.println("Calculando el doble de " + num + "...");
		return num * 2;
	}
	
	// triple(num)

}
