package tarefas22junho.banco;

import java.util.Scanner;

public class TesteBanco {
    public static void main(String[] args) {
ContaPoupanca cp = new ContaPoupanca("roberta", 2461, 18.0);
ContaPoupanca cp1 = new ContaPoupanca("athos", 9393, 8140);

cp.sacar(2.53);
        System.out.println(cp);
        cp.depositar(37);
        System.out.println(cp);
        cp.caucularNovoSaldo(37);
        System.out.println(cp);
        cp1.sacar(8000);
        System.out.println(cp1);
         cp1.caucularNovoSaldo(39);
        System.out.println(cp1);
        cp1.depositar(22);
        ContaEspecial es = new ContaEspecial("murilo", 6363, 700);
        System.out.println(es);
          es.sacar(700.0);

        System.out.println(es);
es.cauculaTributo();
        System.out.println(es);
        es.depositar(440.93);
        System.out.println(es);
        es.cauculaTributo();
        System.out.println(es);
        SeguroDeVida s = new SeguroDeVida("eleonor", 3535, 750);
s.depositar(300);
s.depositar(800.0);
        System.out.println(s);

            }
}
