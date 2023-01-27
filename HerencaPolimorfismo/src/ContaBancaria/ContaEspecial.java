package ContaBancaria;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public ContaEspecial(String nomeCliente, String numeroConta, double saldo, double limite) {
        super(nomeCliente, numeroConta, saldo);
        this.limite = limite;
    }


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double sacar(double x) {
        double total = getLimite()+getSaldo();
        if((total>= x)){

        }else{
            System.out.println("Não é possível realizar essa transação");

        }
        return total-x;
    }

    @Override
    public String status() {
        return " ContaEspecial {" +
                " limite= " + getLimite() + " saldo= "+ getSaldo()+ " Numero da conta= " + getNumeroConta() + " Nome= "+getNomeCliente()+
                '}';
    }
}
