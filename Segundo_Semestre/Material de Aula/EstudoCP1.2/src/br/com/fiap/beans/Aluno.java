package br.com.fiap.beans;

public class Aluno {
    private String nome;
    private int rm;
    private double nota;

    public Aluno() {
        super();
    }

    public Aluno(String nome, int rm, double nota) {
        super();
        this.nome = nome;
        this.rm = rm;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", rm=" + rm +
                ", nota=" + nota +
                '}';
    }
}
