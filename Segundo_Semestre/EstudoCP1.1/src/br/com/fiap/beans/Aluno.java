package br.com.fiap.beans;

public class Aluno {
    private String nome;
    private int Idade;
    private double nota;

    public Aluno() {
        super();
    }

    public Aluno(String nome, int idade, double nota) {
        super();
        this.nome = nome;
        Idade = idade;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
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
                ", Idade=" + Idade +
                ", nota=" + nota +
                '}';
    }
}
