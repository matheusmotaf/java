package eclipse;

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