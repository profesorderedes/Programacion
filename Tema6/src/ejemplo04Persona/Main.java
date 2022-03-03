package ejemplo04Persona;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("11128912Y","Pepe",
				"Rodríguez Pérez", "2819-1231-2121-4525");
		
		Empleado empleado1 = new Empleado("21988921Y", 
				"María", "Alarcón Sánchez", "2123234tas");
		
		cliente1.mostrar();
	}

}
