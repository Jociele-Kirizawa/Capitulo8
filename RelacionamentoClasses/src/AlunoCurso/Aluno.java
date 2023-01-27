package AlunoCurso;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private String matricula;
    private double notas[];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }


    public String status() {

        double soma = 0;
        for ( double nota : notas){
            soma += nota;
        }
        double media = soma/4;
        if (media>= 7){
            return nome + " Aprovado com a média " + media;
        }else {
            return nome + " Reprovado com a média " + media;
        }



    }
    public double mediaAluno (){
        double soma = 0;
        for ( double nota : notas){
            soma += nota;
        }
        double media = soma/4;
        return media;
    }
}



/*Escreva	uma	classe	para	representar	um	Curso,	que	tem	nome	e	horário.
Cada	curso	tem	um	Professor,	que	possui	nome,	departamento	e	email.
Cada	Curso	também	pode	ter	vários	alunos	(tipo	Aluno).	Cada	Aluno	tem
nome,	matricula	e	4	notas. Escreva	um	programa	teste	que	crie	um	Curso
com	5	alunos,	e	que	preça	para	o	usuário	entrar	com	as	4	notas	de	cada
aluno.	Ao	final,	imprima	a	média	de	cada	aluno,	se	o	mesmo	está	aprovado
(media	maior	ou	igual	a	7),	e	qual	é	a	média	da	turma.*/