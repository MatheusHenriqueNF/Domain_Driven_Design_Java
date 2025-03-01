package br.com.fiap.beans;

public class Aluno {
    private int rm;
    private String nome;
    private String turma;
    private double nota;

    public Aluno() {
        super();
    }

    public Aluno(int rm, String nome, String turma, double nota) {
        super();
        this.rm = rm;
        this.nome = nome;
        this.turma = turma;
        this.nota = nota;
    }

    public int getRm() {
        return rm;
    }

    public String getNome() {
        return nome;
    }

    public String getTurma() {
        return turma;
    }

    public double getNota() {
        return nota;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "rm=" + rm +
                ", nome='" + nome + '\'' +
                ", turma='" + turma + '\'' +
                ", nota=" + nota +
                '}';
    }
}