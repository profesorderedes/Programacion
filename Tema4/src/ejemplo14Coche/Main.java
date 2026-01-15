package ejemplo14Coche;

public class Main {

	public static void main(String[] args) {

		Coche coche1 = new Coche("Seat", "Ibiza", "2000ABC");
		Coche coche2 = new Coche("Renault", "Clio", "1882DEF");

		coche1.setDescuento(10);

		System.out.println(coche2.getDescuento());

		coche2.setDescuento(25);

		System.out.println(coche1.getDescuento());

	}

}
