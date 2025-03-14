package br.com.fiap.beans;

public class Carro {
    private String modelo;
    private int ano;
    private double preco;

    public Carro() {
        super();
    }

    public Carro(String modelo, int ano, double preco) {
        super();
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                '}';
    }
}
