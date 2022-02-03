package ejemplo09;

public class Main {

	public static void main(String[] args) {

		Circulo circulo1 = new Circulo();

		circulo1.x = 5;
		circulo1.y = 2;
		circulo1.radio = 4;
		circulo1.color = "Rosa";
		
		circulo1.mostrar();
		
		System.out.println("Área = " + circulo1.area());
		System.out.println("Perímetro = " 
				+ circulo1.perimetro());

	}

}
