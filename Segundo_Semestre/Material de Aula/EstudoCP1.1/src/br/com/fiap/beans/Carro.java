package br.com.fiap.beans;

public class Carro {
    private String nome;
    private  int ano;
    private double preco;

    public Carro() {
        super();
    }

    public Carro(String nome, int ano, double preco) {
        super();
        this.nome = nome;
        this.ano = ano;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                '}';
    }
}
