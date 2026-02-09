package ejemplo01Herencia;

public class Main {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Mario", "Domínguez", "10200200R", "1902-1000-2000-3000");
		Empleado e1 = new Empleado("Ana", "Sánchez", "40100200E", "07-18281928-31");
		Proveedor p1 = new Proveedor("Luisa", "Martínez", "19200120A", "07180");

		c1.mostrar();
		e1.mostrar();
		p1.mostrar();

	}

}
