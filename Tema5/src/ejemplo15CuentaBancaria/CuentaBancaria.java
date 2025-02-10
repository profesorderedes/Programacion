package ejemplo15CuentaBancaria;

public class CuentaBancaria {

	private double saldo;

	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double cantidad) {

		saldo = saldo + cantidad;

	}

	public boolean retirar(double cantidad) {

		if (cantidad > saldo) {
			return false;
		} else {
			saldo = saldo - cantidad;
			return true;
		}

	}

	public double obtenerSaldo() {
		return saldo;
	}

}
