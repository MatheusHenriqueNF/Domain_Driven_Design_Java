package br.com.fiap.beans;

public class Cliente {
    private String nome;
    private int idade;
    private double renda;

    public Cliente() {
        super();
    }

    public Cliente(String nome, int idade, double renda) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", renda=" + renda +
                '}';
    }
}
