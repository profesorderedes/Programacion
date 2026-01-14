package ejemplo09Cuenta;

public class CuentaBancaria {

	double saldo;

	CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}

	void depositar(double cantidad) {
		saldo = saldo + cantidad;
	}

	boolean retirar(double cantidad) {

		if (cantidad <= saldo) {
			saldo = saldo - cantidad;
			return true;
		}

		return false;

	}

	double obtenerSaldo() {
		return saldo;
	}

}
