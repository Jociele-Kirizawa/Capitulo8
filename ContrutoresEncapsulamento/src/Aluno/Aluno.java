package Aluno;

import java.util.Arrays;
import java.util.Scanner;

public class Aluno {

    Scanner scan = new Scanner(System.in);
    private String nome;
    private String sobrenome;
    private String matricula;
    private String [] disciplinas = new String[3];
    private double [][] notas = new double[3][4];


    public Aluno (){
        disciplinas = new String[3];
         notas = new double[3][4];

    }
    public Aluno (String nome, String sobrenome, String matricula){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.matricula=matricula;
        

    }


    public String[] getDisciplinas() {

        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



    public void apresentacao(){
       

        System.out.println("Digite seu nome: ");
        setNome(scan.nextLine());
        System.out.println("Digite seu sobrenome: ");
        setSobrenome(scan.nextLine());
        String [] entradaDisciplina = new String[3];
        for (int i =0; i<disciplinas.length; i++){
        System.out.println("Digite a disciplina: ");
        entradaDisciplina[i]= scan.nextLine();

        }
        setDisciplinas(entradaDisciplina);

        double [][] entradaNotas = new double[3][4];
        for (int i =0; i < notas.length; i++){
            System.out.println("Obtendo notas : " + entradaDisciplina[i]);

            for (int j =0; j<notas[i].length; j++){
                System.out.println("Entre com a nota " + (j+1));
                entradaNotas[i][j]= scan.nextDouble();

            }
        }

        setNotas(entradaNotas);

    }
    double [] soma= new double[3];
    double [] media= new double[3];
    public void situacao(){
        for (int i = 0; i< notas.length; i++){
            for (int j = 0; j< notas[i].length; j++){
                soma[i] += notas[i][j];

            }
        }
        for (int i = 0; i< soma.length; i++){
            media[i] = soma[i]/4;
        }
        for (int i =0; i< soma.length; i++){
            if (media[i]>=7){
                System.out.println("Aprovado na disciplina: " + disciplinas[i] + "Com a média: " + media[i]);

            }else{
                System.out.println("Reprovado na disciplina: " + disciplinas[i] + "Com a média: " + media[i]);

            }
        }
    }



}

/*Escreva	uma	classe para	representar	um	Aluno.	Adicione	atributos
relacionados	às	caracteristicas	de	um	Aluno,	como	nome,	matricula,	curso
que	está	matriculado,	nome	de	3	disciplinas	que	está	cursando e	as	notas
dessas 3 disciplinas. Desenvolva	um	método	para	verificar	se	o	aluno	está
aprovado	(nota	maior	ou	igual	a	7)	em	uma determinada	disciplina.
Escreva	um	programa	para	testar	essa	classe,	que	pede	as	informações	do
aluno	ao	usuário	e	ao	final	informa	o	nome	das	disciplinas,	mostra	as
notas e	mostra	se	o	aluno	foi	aprovado	ou	não*/