package Agenda;

import Agenda.Agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);
        Contato[] contatos = new Contato[3];
        for (int i = 0; i<3; i++){
            System.out.println("Entre com as informações do contato: " + (i+1));
            Contato c = new Contato();

            System.out.println("Entre com o nome: ");
            nome= scan.nextLine();
            c.setNome(nome);

            System.out.println("Entre com o telefone: ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com email: ");
            String email = scan.nextLine();
            c.setEmail(email);
            contatos[i] = c;
        }

        agenda.setContatos(contatos);
        System.out.println(agenda.Status());





    }
}
/*Escreva	uma	classe	Agenda,	que	contém	vários	contatos	do	tipo	Contato.
Cada	contato	possui	nome,	telefone	e	email. A	Agenda	também	possui	um
nome.	Crie	um	programa	teste	que	peça	para	o	usuário	entrar	com	o
nome	da	Agenda	e	em	seguida	3	contatos.	Crie	métodos	que	retornem
uma	String	com	a	informação	de	cada	contato	e	também	de	todos	os
contatos	da	agenda.*/