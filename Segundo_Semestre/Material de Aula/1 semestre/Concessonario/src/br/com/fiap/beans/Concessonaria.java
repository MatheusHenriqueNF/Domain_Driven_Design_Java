package br.com.fiap.beans;

public class Concessonaria {

    private String nome;
    private String email;
    private String cnpj;
    private int qtdColaboradores;
    private Carro carro;


    public Concessonaria(){
        super();
    }

    public Concessonaria(String cnpj, int qtdColaboradores) {
        super();
        this.nome.toUpperCase();
        this.email.toLowerCase();
        this.cnpj = cnpj;
        this.qtdColaboradores = qtdColaboradores;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtdColaboradores() {
        return qtdColaboradores;
    }

    public void setQtdColaboradores(int qtdColaboradores) {
        this.qtdColaboradores = qtdColaboradores;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Concessonaria" +
                "\nNome: " + nome  +
                "\nEmail: " + email  +
                "\ncnpj: " + cnpj  +
                "\nqtdColaboradores: " + qtdColaboradores +
                "\ncarro: " + carro + "\n";
    }
}
