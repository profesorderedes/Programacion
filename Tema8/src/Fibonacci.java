
public class Fibonacci {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.print(fibonacci(i) + "  ");
		}
		
	}
	
	private static int fibonacci(int n) {
		
		if(n == 0 || n == 1) {
			// Caso base.
			return 1;
		}else {
			// Caso recursivo.
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
	}

}
