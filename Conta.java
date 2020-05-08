package eclipse;

class Conta{
    double saldo=2000;
    private int numeroConta;
    private double limite = 1000;
    Titular cliente;
    void setSaldo(double recebeSaldo){
        this.saldo = recebeSaldo;
    }
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
    void saque(double valorSaque){
        if (valorSaque<=this.saldo) {
        		this.saldo-= valorSaque;
                System.out.printf("Saldo atual: %.2f", this.saldo);
	        }
	        else{
	            System.out.println("SAQUE NÃO DISPONIVEL");
	        }
    }
    void deposito(double valorDeposito) {
    	this.saldo+=valorDeposito;
    }
}