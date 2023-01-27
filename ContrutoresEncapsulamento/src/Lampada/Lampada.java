package Lampada;

public class Lampada {

    private String modelo;
    private String cor;
    private int tensao;
    private boolean ligada;

    public Lampada(String modelo, String cor, int tensao, boolean ligada) {
        this.modelo = modelo;
        this.cor = cor;
        this.tensao = tensao;
        this.ligada = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar() {
        setLigada(true);

    }
    public void desligar (){
        setLigada(false);
    }

    public void mostrarEstado(){
        if (ligada==true){
            System.out.println("Lampada Ligada " + "modelo: " + getModelo() + "cor: " + getCor() + " tensão: " + getTensao());
        }else{
            System.out.println("Lampada Desligada " + "modelo: " + getModelo() + "cor: " + getCor() + " tensão: " + getTensao());
        }
    }
}






/*Escreva	uma classe para	representar	uma	lâmpada. Desenvolva	métodos
        para	ligar,	desligar	a	lampada*/