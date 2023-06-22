package tarefas22junho.banco;

public abstract class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
  this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0){
            throw new IllegalStateException("Saldo inválido, não pode estar negativo");
        }
        this.saldo = saldo;
    }
    public abstract void sacar(double saldo);
public abstract void depositar(double saldo);
}
