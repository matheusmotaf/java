package eclipse;

public class ContaPoupanca extends Conta{
    public void saque(double valorSaque){
        if(valorSaque <= this.getSaldo()){
            super.saque(valorSaque);
            System.out.println(this.getSaldo());
        }
    }
}
