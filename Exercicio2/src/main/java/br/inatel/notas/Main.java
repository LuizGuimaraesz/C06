package br.inatel.notas;

public class Main {

    public static void main(String[] args) {

        Turma turma = new Turma();

        Aluno a1 = new Aluno("Luiz", "001", 8.5);
        Aluno a2 = new Aluno("Maria", "002", 9.2);
        Aluno a3 = new Aluno("João", "003", 7.8);

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);
        turma.adicionarAluno(a3);

        System.out.println("Lista de alunos:");
        turma.listarAlunos();

        Aluno melhor = turma.buscarMelhorAluno();

        System.out.println("Melhor aluno:");
        System.out.println(
                melhor.getNome() +
                        " - Média: " +
                        melhor.getNota()
        );

    }
}
