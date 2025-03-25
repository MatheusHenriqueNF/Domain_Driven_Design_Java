package br.com.fiap.beans;

public class Pessoa {

    private String nome;
    private String email;
    private double renda;

    public Pessoa() {
        super();
    }

    public Pessoa(String nome, String email, double renda) {
        this.nome = nome;
        this.email = email;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", renda=" + renda +
                '}';
    }
}
