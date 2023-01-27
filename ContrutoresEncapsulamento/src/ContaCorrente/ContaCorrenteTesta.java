package ContaCorrente;

public class ContaCorrenteTesta {
    public static void main(String[] args) {
        ContaCorrente C1 = new ContaCorrente("1234",100,true);

        System.out.println(C1.getSaldo());;
       // System.out.println(C1.contaEspecial());
        C1.saque(110);
        System.out.println(C1.getSaldo());;
        C1.depositar(500);
        System.out.println(C1.getSaldo());;
    }
}
