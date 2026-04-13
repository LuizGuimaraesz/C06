package br.inatel.notas;

public class Turma {

    private Aluno[] alunos;
    private int qtdAlunos;

    public Turma() {

        alunos = new Aluno[10]; // capacidade máxima
        qtdAlunos = 0;

    }

    public void adicionarAluno(Aluno aluno) {

        if (qtdAlunos < alunos.length) {

            alunos[qtdAlunos] = aluno;
            qtdAlunos++;

        } else {

            System.out.println("Turma cheia!");

        }

    }

    public void listarAlunos() {

        for (int i = 0; i < qtdAlunos; i++) {

            alunos[i].exibirInfo();

        }

    }

    public Aluno buscarMelhorAluno() {

        Aluno melhor = alunos[0];

        for (int i = 1; i < qtdAlunos; i++) {

            if (alunos[i].getNota() > melhor.getNota()) {

                melhor = alunos[i];

            }

        }

        return melhor;

    }

}