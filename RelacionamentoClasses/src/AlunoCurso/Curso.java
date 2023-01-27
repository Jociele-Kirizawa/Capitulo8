package AlunoCurso;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Curso {
    private String nome;
    private LocalTime hora;
    private Professor professor;
    private Aluno [] alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        String s = "Curso{" +
                "nome='" + nome + '\'' +
                ", hora=" + hora +
                ", professor=" + professor +

                mediaTurma() + "}";
        for ( Aluno aluno: alunos ){
            s += aluno.getNome() + " ";
        }
        return s;
    }
    public double mediaTurma(){
        double soma=0;
        for (Aluno aluno : alunos){
            if (aluno != null){
            soma+= aluno.mediaAluno();}
        }
        return  soma;
    }
}
