package ejemplo02Herencia;

public class Main {

	public static void main(String[] args) {

//		Vehiculo v1 = new Vehiculo("9025BYH", "Peugeot", "206");
		Coche c1 = new Coche("2800ABC", "Seat", "Ibiza", 95);
		Moto m1 = new Moto("9128AFD", "Honda", "CBR", 120);

		c1.mostrar();
		m1.mostrar();

	}

}
