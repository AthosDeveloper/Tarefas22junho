package tarefas22junho.animais;

public class Mamifero extends Animal {
     private String alimento;
public Mamifero(){

}

     public Mamifero(String nome, double cumprimento, int numeroPatas, String cor, String abiente, int velocidade, String alimento) {
          super(nome, cumprimento, numeroPatas, cor, abiente, velocidade);
          this.alimento = alimento;
     }

     public String getAlimento() {
          return alimento;
     }

     @Override
     public String toString() {
          return " Nome do animal: " + this.getNome()  + " cumprimento: " + this.getCumprimento() + " Quantidade de patas: " + this.getNumeroPatas() + " Cor: " + this.getCor() + " Ambiente: " + this.getAbiente() + " Velocidade: " + this.getVelocidade() + " Metros por segundo." + " Alimento principal: " + this.getAlimento();

     }
}

