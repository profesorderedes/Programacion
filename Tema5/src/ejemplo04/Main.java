package ejemplo04;

public class Main {

	public static void main(String[] args) {

		Punto p1 = new Punto();

		p1.x = 2;
		p1.y = 5;
		p1.color = "Rojo";

//		p1.mostrar();
		
		Punto p2= new Punto();
		Punto p3= new Punto();
		
		p2.color = "amarillo";
		p2.x = 2;
		p2.y = 5;
		
		p3.color = "naranja";
		p3.x = 3;
		p3.y = 3;
		
		// Desplazamos el punto 2, 10 píxeles a la derecha.
		p2.desplazar(10);
		p2.mostrar();

	}
	
	

}
