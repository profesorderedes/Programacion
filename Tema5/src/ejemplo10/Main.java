package ejemplo10;

public class Main {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(10, 20, 50, 30, "Azul");
		
		r1.mostrar();
		
		Rectangulo r2 = new Rectangulo();
		r2.x = 50;
		r2.y = 70;
		r2.altura = 200;
		r2.base = 150;
		r2.color = "Azul";
		
		r2.mostrar();
		
		Rectangulo r3 = new Rectangulo(30,30, 40,30);
		r3.mostrar();
		
	}

}
