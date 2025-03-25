package br.com.fiap.beans;

public class Colaborador {

    private String nome;
    private String cargo;
    private double valorHora;
    private double qtdHora;
    private Endereco endereco;

    public Colaborador() {
        super();
    }

    public Colaborador(String nome, String cargo, double valorHora, double qtdHora) {
        super();
        this.nome = nome;
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.qtdHora = qtdHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(double qtdHora) {
        this.qtdHora = qtdHora;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", valorHora=" + valorHora +
                ", qtdHora=" + qtdHora +
                ", endereco=" + endereco +
                '}';
    }

    public double salarioTotal(){
        return valorHora * qtdHora;
    }
}
