package eclipse;

import java.util.Scanner;

public class Programa {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
	Conta matheus = new Conta();
    Conta jose = new Conta();
    Titular c = new Titular();
    matheus.cliente = c;
    jose.cliente = c;
    matheus.saque(in.nextDouble());
    
}
}    
class Conta{
    private double saldo=60000;
    private int numeroConta;
    private double limite=3000;
    Titular cliente;
    protected void setSaldo(double recebeSaldo){
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
    protected void saque(double valorSaque){
        if (valorSaque<=this.saldo||valorSaque<=this.limite) {
            this.saldo-=valorSaque;
            if(valorSaque>this.saldo){
                System.out.printf("ATENÇÃO: Você usou cheque especial, Saldo atual: %.2f", this.saldo);
            }
            else{
                System.out.printf("Saldo apos saque: %.2f", this.saldo);
            }
        }
        else{
            System.out.println("SAQUE NÃO DISPONIVEL");
        }
    }
}
class Titular{
    private String nome;
    private String rg;
    private String cpf;

    void setNome(String recebeNome){
        this.nome=recebeNome;
    }
    String getNome(){
        return this.nome;
    }
    
    void setRg(String recebeRg){
        this.rg=recebeRg;
    }
    String getRg(){
        return this.rg;
    }
    
    void setCpf(String recebeCpf){
        this.cpf=recebeCpf;
    }
    
    String getCpf(){
        return this.cpf;
    }
}
