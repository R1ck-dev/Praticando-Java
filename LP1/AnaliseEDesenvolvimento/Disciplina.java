package LP1.AnaliseEDesenvolvimento;

import java.util.List;

public class Disciplina {
    private String nome;
    private List<Aluno> alunos;
    private Professor professor;

    public Disciplina() {
    }

    public Disciplina(String nome, List<Aluno> alunos, Professor professor) {
        this.nome = nome;
        this.alunos = alunos;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void add(Aluno aluno) {
        alunos.add(aluno);
    }

}
