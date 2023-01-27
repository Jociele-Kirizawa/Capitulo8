package Contador;

public class ContadorTeste {
    public static void imprimir(){
        System.out.println(Contador.obterValor());
    }
    public static void main(String[] args) {
        imprimir();
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        imprimir();
        Contador.zerar();
        imprimir();
    }
}
