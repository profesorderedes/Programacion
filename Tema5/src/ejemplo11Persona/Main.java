package ejemplo11Persona;

public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Rubén","López Martín",
				30);
		
		persona1.mostrar();
		
		Persona persona2 = new Persona();
		persona2.mostrar();
		
		Persona persona3 = new Persona("Amparo", "López");
		persona3.mostrar();

	}

}
