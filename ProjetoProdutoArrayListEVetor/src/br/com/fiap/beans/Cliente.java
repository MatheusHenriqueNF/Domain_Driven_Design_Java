package br.com.fiap.beans;

public class Cliente {
    private String cpf;
    private String nome;
    private int idade;
    private String numeroCelular;
    private double renda;

    public Cliente() {
        super();
    }

    public Cliente(String cpf, String nome, int idade, String numeroCelular, double renda) {
        super();
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.numeroCelular = numeroCelular;
        this.renda = renda;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public double getRenda() {
        return renda;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNumeroCelcular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", numeroCelular='" + numeroCelular + '\'' +
                ", renda=" + renda +
                '}';
    }
}
