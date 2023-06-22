package tarefas22junho.banco;

import java.text.DecimalFormat;

public class SeguroDeVida extends ContaBancaria implements Tributo {
    final double  taxaAplicada = 0.42;

    public SeguroDeVida(String nomeCliente, int numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }

    @Override
    public void depositar(double saldo) {
        setSaldo(saldo);
    }

    @Override
    public void sacar(double saldo) {
double valorSacado = this.getSaldo() - saldo;
setSaldo(valorSacado);
    }

    @Override
    public double cauculaTributo() {
double valorTributo = this.getSaldo() * taxaAplicada;
double valorComDesconto = getSaldo() - valorTributo;
        return valorComDesconto;
    }
    @Override
    public String toString() {
        DecimalFormat d = new DecimalFormat();
        return" Nome do cliente: " + this.getNomeCliente() + " número da conta: " + this.getNumConta() + " saldo atual: " + this.getSaldo() + " Com tributo aplicado: " + d.format(this.cauculaTributo());
    }
}

