package cuentaBancaria;

public class Main {

	public static void main(String[] args) {
		// Para ir haciendo pruebas.
		CuentaBancaria cuenta = new CuentaBancaria(1000);

		System.out.println("Saldo: " + cuenta.obtenerSaldo() + " euros.");

		cuenta.depositar(500);
		System.out.println("Saldo: " + cuenta.obtenerSaldo() + " euros.");

		if (cuenta.retirar(10000)) {
			System.out.println("Saldo: " + cuenta.obtenerSaldo() + " euros.");
		} else {
			System.out.println("No hay fondos suficientes.");
		}
		
	}

}
