package ejemplo17Finalize;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona("Pedro", "López", 20);

		for (int i = 0; i < 100000; i++) {
			p1 = new Persona("Pedro", "López", 20);
			p1 = null;
		}

	}

}
