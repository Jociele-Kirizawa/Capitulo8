package Lampada;

public class LampadaTeste extends Lampada {
    public LampadaTeste(String modelo, String cor, int tensao, boolean ligada) {
        super(modelo, cor, tensao, ligada);
    }

    public static void main(String[] args) {
        Lampada L = new Lampada("Led","branca",110,false);

        L.mostrarEstado();
        L.ligar();
        L.mostrarEstado();
        L.desligar();


    }
}
