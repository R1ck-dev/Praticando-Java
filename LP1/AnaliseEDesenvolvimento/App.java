package LP1.AnaliseEDesenvolvimento;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Professor prof = new Professor("P123", "João", "joão@email.com", "senha123");

        List<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(new Aluno("A001", "Ada"));
        listaAlunos.add(new Aluno("A002", "Grace"));
        listaAlunos.add(new Aluno("A003", "Leon"));

        Disciplina lp1 = new Disciplina("Linguagem de Programação 1", listaAlunos, prof);

        System.out.println("Disciplina: " + lp1.getNome());
        System.out.println("Professor: " + lp1.getProfessor().getNome());
        System.out.println("Quantidade de alunos: " + lp1.getAlunos().size());
        
        for (Aluno a : lp1.getAlunos()) {
            System.out.println(" - Aluno: " + a.getNome() + " (" + a.getProntuario() + ")");
        }
    }
}