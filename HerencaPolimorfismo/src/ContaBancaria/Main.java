package ContaBancaria;

import ContaBancaria.ContaBancaria;
import ContaBancaria.ContaPoupanca;
import ContaBancaria.ContaEspecial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       ContaBancaria contaBancaria = new ContaBancaria("Jociele", "1234", 1500);
        System.out.println(contaBancaria.getSaldo());
        System.out.println( contaBancaria.sacar(100));
        System.out.println( contaBancaria.depositar(200));
        System.out.println(contaBancaria.sacar(1700));
        System.out.println(contaBancaria.sacar(600));
        System.out.println(contaBancaria.status());

        ContaPoupanca contaPoupanca = new ContaPoupanca("Juliano","345",1500,10);
        System.out.println( contaPoupanca.status());
        System.out.println(contaPoupanca.rendimento());
        System.out.println(contaPoupanca.depositar(100));
        System.out.println(contaPoupanca.getSaldo());

        ContaEspecial contaEspecial = new ContaEspecial("Gabriel", "456", 400, 500);
        System.out.println(contaEspecial.status());
        System.out.println(contaEspecial.sacar(700));






    }
}