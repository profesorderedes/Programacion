package ejemplo01Persona;

public class Main {

	public static void main(String[] args) {

//		Persona p1 = new Persona("García", "Antonio", "22100200R");
//
//		p1.mostrar();

		Cliente c1 = new Cliente("Martínez", "Luis", "10299100K", "1092-1274-1291-5312");
		c1.mostrar();

		Empleado e1 = new Empleado("López", "Daniel", "10299197G", 38912961);
		e1.mostrar();

		// El polimorfismo me permite declarar una variable de
		// la clase Persona (padre) y asignarle un objeto de la
		// clase Cliente (hija).
		Persona p = new Cliente("Sánchez", "Juan", "19100100Y", "2011-2222-2222-2222");

		// Si ejecutamos un método sobre p, se ejecutará el
		// de la clase hija.
		p.mostrar();

		// No podemos ejecutar un método que esté en la clase
		// hija si no está también en la clase padre.
//		p.getVisa(); <-- Da error

		// Sí podemos hacer lo anterior si previamente hacemos
		// un cast de la variable.
		((Cliente) p).getVisa();

		ensenyar(c1);

		ensenyar(e1);

	}

	// El siguiente método admite como parámetro cualquier
	// objeto de una clase hija de Persona (por ejemplo, Cliente
	// o empleado). Esto es posible gracias al polimorfismo.
	public static void ensenyar(Persona persona) {
		persona.mostrar();
	}

}
