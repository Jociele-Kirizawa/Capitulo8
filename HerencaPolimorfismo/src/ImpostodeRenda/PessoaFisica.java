package ImpostodeRenda;

import java.util.Scanner;

public class PessoaFisica extends  Contribuinte{
    private double renda;

    public PessoaFisica(String nome, double renda) {
        super(nome);
        this.renda = renda;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public PessoaFisica(String nome) {
        super(nome);
    }

    Scanner scan = new Scanner(System.in);
    public double impostoFisica (double renda){

        if(renda>=0&&renda<=1400){
            return 0;
        } if (renda>= 1400.01 && renda<= 2100) {
            return (renda*0.1) - 100;

        } if (renda>=2100.01 && renda<= 2800) {
            return (renda*0.15)- 270;

        } if (renda>= 2800.01 && renda<=3600) {
            return (renda*0.25)-500;

        }else {
            return (renda*0.3)-700;
        }
    }
}
