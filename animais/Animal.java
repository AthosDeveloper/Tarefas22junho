package tarefas22junho.animais;

public class Animal {
    private String nome;
    private double cumprimento;
    private int numeroPatas;
    private  String cor;
    private String abiente;
    private int velocidade;

    public Animal(String nome, double cumprimento, int numeroPatas, String cor, String abiente, int velocidade) {
        this.nome = nome;
        this.cumprimento = cumprimento;
        this.numeroPatas = numeroPatas;
        this.cor = cor;
        this.abiente = abiente;
        this.velocidade = velocidade;
    }
    public Animal(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCumprimento() {
        return cumprimento;
    }

    public void setCumprimento(double cumprimento) {
        this.cumprimento = cumprimento;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAbiente() {
        return abiente;
    }

    public void setAbiente(String abiente) {
        this.abiente = abiente;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return  " Nome do animal: " + this.getNome()  + " cumprimento: " + this.getCumprimento() + " Quantidade de patas: " + this.getNumeroPatas() + " Cor: " + this.getCor() + " Ambiente: " + this.getAbiente() + " Velocidade: " + this.getVelocidade() + " Metros por segundo.";
    }
}
