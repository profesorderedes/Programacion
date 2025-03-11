package ejemplo16GarbageCollector;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Creando objetos a lo loco...");
		
		for(int i = 0; i < 10000000000L; i++) {
			Circulo c1 = new Circulo(10, 20, 5);
		}
		
		System.out.println("Listo.");
	}

	
}
