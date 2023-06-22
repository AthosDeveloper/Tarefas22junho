package tarefas22junho.animais;

public class Urso extends  Mamifero {
    public Urso(String nome, double cumprimento, int numeroPatas, String cor, String abiente, int velocidade, String alimento) {
        super(nome, cumprimento, numeroPatas, cor, abiente, velocidade, alimento);
    }

    @Override
    public String toString() {
   return  " Nome do animal: " + this.getNome()  + " cumprimento: " + this.getCumprimento() + " Quantidade de patas: " + this.getNumeroPatas() + " Cor: " + this.getCor() + " Ambiente: " + this.getAbiente() + " Velocidade: " + this.getVelocidade() + " Metros por segundo." + " Alimento principal: " + this.getAlimento();
    }


}



