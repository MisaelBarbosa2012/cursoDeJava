public class ContaBancaria {
    private String nome;
    private String numeroConta;
    private double deposito;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getDeposito(){
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
}

