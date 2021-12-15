
/*
 * Intercambiar los valores de dos variables
 */
public class Ejemplo06 {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 9;
		int aux;
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}

}
