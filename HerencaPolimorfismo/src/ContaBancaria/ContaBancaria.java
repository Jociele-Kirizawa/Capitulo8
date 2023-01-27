package ContaBancaria;

public class ContaBancaria {

    private String nomeCliente;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, String numeroConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    public double sacar(double x){
        if(saldo>= x){
            saldo-=x;

        }else {
            System.out.println("Saldo insuficiente");
        }
        return saldo;
    }
    public double depositar(double x){
        saldo+=x;
        return saldo;    }


    public String status() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
