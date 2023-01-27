package ImpostodeRenda;

import java.util.Scanner;

public class PessoaJuridica extends Contribuinte{
    public PessoaJuridica(String nome, double renda) {
        super(nome);
        this.renda = renda;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    private double renda;

    public PessoaJuridica(String nome) {
        super(nome);
    }


    public double impostoJuridico(double x){

        return (x*0.1);

    }
}
