package ejemplo02Punto;

public class Main {

	public static void main(String[] args) {

		// Creamos un objeto de tipo Punto y le damos valores.
		Punto punto1 = new Punto();

		punto1.x = 10;
		punto1.y = 5;
		punto1.color = "verde";

		// Mostramos los valores de punto1.
		punto1.mostrar();

		// Desplazamos punto1 10px hacia la derecha y 20px hacia
		// abajo.
		punto1.desplazar(10, 20);
		punto1.mostrar();

		// Desplazamos punto1 5px hacia arriba.
		punto1.desplazar(0, -5);
		punto1.mostrar();

		// Averiguamos si punto1 es rojo.
		if (punto1.esRojo()) {
			System.out.println("El punto es rojo.");
		} else {
			System.out.println("El punto no es rojo.");
		}

	}

}
