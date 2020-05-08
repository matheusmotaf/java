package eclipse;

public class ContaCorrente extends Conta {
	public void s(double valorSaque) {
		if(valorSaque<=this.saldo+super.getLimite()) {
			this.saldo -= valorSaque;
			System.out.println(this.saldo);
		}
		else {
			System.out.println("Não possui saldo na Conta Corrente");
		}
	}
}
