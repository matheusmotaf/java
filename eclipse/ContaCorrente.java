package eclipse;

public class ContaCorrente extends Conta{
    private double chequeEspecial = 200;
    void setChequeEspecial(double recebeCheque){
        this.chequeEspecial=recebeCheque;
    }
    double getChequeEspecial(){
        return this.chequeEspecial;
    }

    public void saque(double valorSaque){
        if(valorSaque <= this.chequeEspecial + this.getSaldo()){
            super.saque(valorSaque);
            System.out.println(this.getSaldo());
        }
    }
}
