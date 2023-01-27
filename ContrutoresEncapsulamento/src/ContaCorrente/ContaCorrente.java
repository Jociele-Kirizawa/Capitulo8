package ContaCorrente;

public class ContaCorrente {
    private String numero;
    private double saldo;
    private boolean especial;

    public ContaCorrente(String numero, double saldo, boolean especial) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double saque (double s){
        if( especial==true && saldo >= s){
            setSaldo(getSaldo()-s);

        }else if (saldo >= s ){
            setSaldo(getSaldo()-s);

        }else{
            System.out.println("Saldo insuficiente. Saque não realizado");
        }

        return saldo;
    }
    public double depositar( double s){
        setSaldo(getSaldo()+s);
        return saldo;
    }

    public double consultarSaldo(){
        return  getSaldo();
    }

    public String contaEspecial(){
        if (especial==true){
            setSaldo(getSaldo()+500);
            return "Conta Especial";
        }else{
            return "Conta Comum";
        }

    }
}


/*Cria	uma	classe	para	representar	uma	conta	corrente	que	possui	um
número,	um	saldo,	um	status	que	informa	se	ela	é	especial	ou	não, um
limite. Desenvolva	métodos	para	realizar	saque	(verificando	se	o	cliente
pode	realizar	saques),	despositar	dinheiro,	consultar	saldo	e	verificar	se	o
cliente	está	usando	cheque	especial	ou	não.	Desenvolva	um	programa
para	testar	essa	classe.*/