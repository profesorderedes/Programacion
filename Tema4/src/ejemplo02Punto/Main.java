package ejemplo02Punto;

public class Main {

	public static void main(String[] args) {

		// Creamos algunos objetos de la clase Punto.

		Punto punto1 = new Punto();
		Punto punto2 = new Punto();
		Punto punto3 = new Punto();

		// Asignamos valores a los objetos Punto.

		punto1.x = 100;
		punto1.y = 27;
		punto1.color = "verde";

		punto2.x = 50;
		punto2.y = 50;
		punto2.color = "rojo";

		// Acceder a los valores de los atributos de los puntos.
		System.out.println("Punto1: x=" + punto1.x + ", y=" + punto1.y + ", color=" + punto1.color);
		System.out.println("Punto2: x=" + punto2.x + ", y=" + punto2.y + ", color=" + punto2.color);
		
		// Mostramos los valores de los atributos de los puntos pero usando mostrar().
		punto1.mostrar();
		punto2.mostrar();
		
		// Desplazamos los puntos 10 unidades a la derecha, y quedan así:
		punto1.moverX(10);
		punto2.moverX(10);
		
		punto1.mostrar();
		punto2.mostrar();
	}
}













