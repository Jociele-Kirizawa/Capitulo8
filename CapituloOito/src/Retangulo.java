public class Retangulo {
    private double largura;
    private double base;


    public Retangulo(double L, double B) {
        this.largura = L;
        this.base = B;
    }

    public void setLargura(double L) {
        this.largura = L;

    }

    public double getLargura() {
        return largura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public double perimetro() { //aqui não precisa de argumento, porque já tenho os dados dentro da classe.
        return (2 * getBase()) + (2 * getLargura());
    }

    public double area() {
        return getLargura() * getBase();
    }
}





/*(Classe Rectangle) Crie uma classe Rectangle com os atributos length e width, cada um dos quais assume o padrão de 1. Forneça
os métodos que calculam o perímetro e a área do retângulo. A classe tem métodos set e get para o comprimento (length) e a largura
(width). Os métodos set devem verificar se length e width são, cada um, números de ponto flutuante maiores que 0,0 e menores que
20,0. Escreva um programa para testar a classe Rectangle.*/