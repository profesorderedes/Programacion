
public class Ejemplo10 {

	public static void main(String[] args) {
		
		int num = 6;
		int lista[] = {9, 5, 8, 7, 3, 10};
		
		dobleNum(num);
		dobleArray(lista);
		
	}
	
	static void dobleNum(int num) {
		System.out.println(num * 2);
	}
	
	// Va a multiplicar cada valor del array lista por dos.
	static void dobleArray(int lista[]) {
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = lista[i] * 2;
		}
		
	}
	
}
