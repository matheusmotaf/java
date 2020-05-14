package eclipse;

public class ContaCorrenteConta {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.deposito(500);
        contaPoupanca.saque(400);
        contaCorrente.saque(10);
    }
}
