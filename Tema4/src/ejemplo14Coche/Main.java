package ejemplo14Coche;

public class Main {

	public static void main(String[] args) {

		Coche coche1 = new Coche("Seat", "Ibiza", "2000ABC");
		Coche coche2 = new Coche("Renault", "Clio", "1882DEF");

		Coche.setDescuento(10);

		System.out.println(Coche.getDescuento());

		Coche.setDescuento(25);

		System.out.println(Coche.getDescuento());

	}

}
