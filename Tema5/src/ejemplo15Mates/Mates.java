package ejemplo15Mates;

public class Mates {
	
	static final double PI = 3.141592;
	static final double E = 2.71828;
	
	static int num;
	
	int pow(int base, int exponente) {
		
		int potencia = 1;
		
		for (int i = 1; i <= exponente; i++) {
			potencia = potencia * base;
		}
		
		return potencia;
		
	}

}