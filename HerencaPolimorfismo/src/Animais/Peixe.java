package Animais;

public class Peixe extends Animal{
    private String caracteristicas;

    public Peixe(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade, String caracteristicas) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        super.setPatas(0);
        this.caracteristicas = caracteristicas;
    }


    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Peixe{" + "nome " + getNome() + "Patas: " + getPatas() + "Ambiente " + getAmbiente() +
                "Cor: " + getCor() + "Velocidade: " + getVelocidade() +
                "caracteristicas='" + caracteristicas + '\'' +
                '}';
    }
}
