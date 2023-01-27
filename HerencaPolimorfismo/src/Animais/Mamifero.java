package Animais;

public class Mamifero extends Animal{
    private String alimento;

   public Mamifero(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "nome: " + getNome() + "Comprimento " + getComprimento() + "Patas " + getPatas() + "Cor: " +getCor() + "Ambiente: " + getAmbiente() +
                "Velocidade: " + getVelocidade() +
                "alimento='" + alimento + '\'' +
                '}';
    }
}
