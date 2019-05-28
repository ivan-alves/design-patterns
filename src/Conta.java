
public class Conta {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
}
