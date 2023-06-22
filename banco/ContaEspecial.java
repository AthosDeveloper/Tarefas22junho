package tarefas22junho.banco;

import java.text.DecimalFormat;

public class ContaEspecial extends ContaBancaria implements Tributo{
 final double limite = 800;

    public ContaEspecial(String nomeCliente, int numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }

    @Override
    public void sacar(double saldo) {
        if (saldo > limite){
            throw  new IllegalStateException("O valor sacado não pode exceder o valor de r$ 800 reais. ");

        }
double valorSacado = this.getSaldo() - saldo;
        setSaldo(valorSacado);
    }

    @Override
    public double cauculaTributo() {
        double tributo = this.getSaldo() * 0.1;
        double tributoCauculado = this.getSaldo() - tributo;
        return  tributoCauculado;
    }

    @Override
    public void depositar(double saldo) {
        setSaldo(saldo);
    }

    @Override
    public String toString() {
        DecimalFormat d = new DecimalFormat();
        return "Nome do cliente: " + this.getNomeCliente() + " número da conta: " + this.getNumConta() + " saldo atual: " + this.getSaldo() + " Com tributo aplicado: " + d.format(this.cauculaTributo());
    }

}
