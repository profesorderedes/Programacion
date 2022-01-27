import java.util.Arrays;

public class Ejemplo10 {

	public static void main(String[] args) {
		
		int num = 6;
		int numeros[] = {9, 5, 8, 7, 3, 10};
		
		// La variable num se pasa por valor porque es un 
		// tipo primitivo.
		dobleNum(num);
		
		// La variable numeros se pasa por referencia porque
		// es un objeto.
		dobleArray(numeros);
		
		System.out.println("La variable num se ha pasado por "
				+ "valor:");
		System.out.println("num = " + num);
		
		System.out.println("La variable numeros se ha pasado "
				+ "por referencia:");
		System.out.println("numeros[0] = " + numeros[0]);
		
	}
	
	static void dobleNum(int valor) {
		
		valor = valor * 2;
		System.out.println(valor);
		
	}
	
	// Va a multiplicar cada valor del array lista por dos.
	static void dobleArray(int lista[]) {
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = lista[i] * 2;
		}
		
		System.out.println(Arrays.toString(lista));
		
	}
	
}
