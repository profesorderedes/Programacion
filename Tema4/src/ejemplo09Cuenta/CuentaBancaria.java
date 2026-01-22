package ejemplo09Cuenta;

public class CuentaBancaria {

	double saldo;

	CuentaBancaria(double saldo) {

		if (saldo < 0) {
			this.saldo = 0;
		} else {
			this.saldo = saldo;
		}

	}

	boolean depositar(double cantidad) {

		if (cantidad < 0) {
			return false;
		}

		saldo = saldo + cantidad;
		return true;

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
