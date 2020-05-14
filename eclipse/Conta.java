package eclipse;

abstract class Conta{
    private double saldo=50;
    private int numeroConta;
    private double limite = 1000;
    Titular cliente;

    double getSaldo(){
        return this.saldo;
    }
    void setNumeroConta(int recebeNconta){
        this.numeroConta = recebeNconta;
    }
    int getNumeroConta(){
        return this.numeroConta;
    }
    void setLimite(double recebeLimite){
        this.limite = recebeLimite;
    }
    double getLimite(){
        return this.limite;
    }
    public void saque(double valorSaque){
        		this.saldo-= valorSaque;
    }
    public void deposito(double valorDeposito) {
    	this.saldo+=valorDeposito;
    }
}