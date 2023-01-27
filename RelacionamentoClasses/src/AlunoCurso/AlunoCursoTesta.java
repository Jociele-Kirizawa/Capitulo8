package AlunoCurso;

import java.util.Scanner;

public class AlunoCursoTesta {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        double [] notas = new double[4];


        Aluno aluno = new Aluno();

        Aluno[]alunos = new Aluno[5];

        Curso log = new Curso();

        Professor prof = new Professor();

        System.out.println("Qual departamento do professor? ");
        prof.setDepartamento(scan.nextLine());
        System.out.println("Qual email do professor? ");
        prof.setEmail(scan.nextLine());
        System.out.println("Qual nome do professor? ");
        prof.setNome(scan.nextLine());
        log.setProfessor(prof);

        System.out.println("Entre como nome do curso: ");
        String curso = scan.nextLine();
        log.setNome(curso);

        for (int i=0; i<5; i++){
            System.out.println( (i+1) + " Qual o nome do aluno: ");
            String nome = scan.nextLine();
            aluno = new Aluno();
            aluno.setNome(nome);
            System.out.println("Qual a matricula do aluno?");
            aluno.setMatricula(scan.nextLine());

            notas = new double[4];
            for (int j=0; j<4; j++){
                System.out.println("Digite a "+ (j+1) + " nota");
                notas[j]= scan.nextDouble();
            }
            aluno.setNotas(notas);
            alunos[i]= aluno;

            scan.nextLine();

            System.out.println(aluno.status());
        }
        log.setAlunos(alunos);


        System.out.println(log.mediaTurma() + "ESSA FOI A MÉDIA DA TURMA");
        System.out.println(log.toString());



        }





    }

