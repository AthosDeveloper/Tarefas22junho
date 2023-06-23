package tarefas22junho.banco;

public class ContaPoupanca extends ContaBancaria {
    private double diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public void sacar(double saldo) {
        double retirarValor = this.getSaldo() - saldo;
        setSaldo(retirarValor);
    }
public void caucularNovoSaldo(double atualizaSaldo){
setDiaRendimento(atualizaSaldo);
double atualiza = (this.getSaldo() + this.getDiaRendimento()) * 22;
setSaldo(atualiza);
}

    @Override
    public void depositar(double saldo) {
        setSaldo(saldo);
    }

    @Override
    public String toString() {
        return  "Nome do cliente: " + this.getNomeCliente() + " número da conta: " + this.getNumConta() + " saldo atual: " + this.getSaldo() + " Rendimento do dia: " + this.getDiaRendimento();
    }
}
