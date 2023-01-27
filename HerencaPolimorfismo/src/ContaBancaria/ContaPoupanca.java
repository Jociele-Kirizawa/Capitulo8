package ContaBancaria;

import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria{
    private double diaRendimento;

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupanca(String nomeCliente, String numeroConta, double saldo, double diaRendimento) {
        super(nomeCliente, numeroConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public double rendimento(){

        setSaldo(getSaldo()*(0.01*diaRendimento)+getSaldo());
        return getSaldo();
    }

    @Override
    public String status() {
        return " ContaPoupanca{" + "Nome do Cliente= "+getNomeCliente()+
                " diaRendimento= " + diaRendimento + " Numero da conta= "+ getNumeroConta() + " saldo= "+getSaldo()+
                '}';
    }
}
