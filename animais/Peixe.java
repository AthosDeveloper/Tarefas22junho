package tarefas22junho.animais;

public class Peixe extends Animal {

    public Peixe() {
super();
    }

    public Peixe(String nome, String caracteristica, double cumprimento, int numeroPatas, String cor, String abiente, int velocidade) {
        super(nome, cumprimento, numeroPatas, cor, abiente, velocidade);
   this.caracteristica = caracteristica;
    }
    private String caracteristica;

    public String getCaracteristica() {
        return caracteristica;
    }

    @Override
    public String toString() {
        return " Nome do animal: " + this.getNome() +" Características: "  + this.getCaracteristica() + " cumprimento: " + this.getCumprimento() + " Quantidade de patas: " + this.getNumeroPatas() + " Cor: " + this.getCor() + " Ambiente: " + this.getAbiente() + " Velocidade: " + this.getVelocidade() + " Metros por segundo.";
    }
}
