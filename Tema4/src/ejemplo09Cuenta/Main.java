package ejemplo09Cuenta;

public class Main {

	public static void main(String[] args) {

		CuentaBancaria miCuenta = new CuentaBancaria(1000);

		System.out.println("Saldo: " + miCuenta.obtenerSaldo() + " euros.");

		double cantidad = 2000;

		System.out.println("Retirando " + cantidad + " euros...");

		if (miCuenta.retirar(cantidad)) {
			System.out.println("El saldo actual es " + miCuenta.obtenerSaldo() + " euros.");
		} else {
			System.out.println("No hay suficientes fondos.");
		}

	}

}
