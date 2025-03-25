package br.com.fiap.beans;

public class Produto {

    private String nome;
    private double peso;
    private int qtdProduto;
    private double valor;
    private int percentualImposto;

    public Produto() {
        super();
    }

    public Produto(String nome, double peso, int qtdProduto, double valor, int percentualImposto) {
        this.nome = nome;
        this.peso = peso;
        this.qtdProduto = qtdProduto;
        this.valor = valor;
        this.percentualImposto = percentualImposto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getPercentualImposto() {
        return percentualImposto;
    }

    public void setPercentualImposto(int percentualImposto) {
        this.percentualImposto = percentualImposto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", qtdProduto=" + qtdProduto +
                ", valor=" + valor +
                ", percentualImposto=" + percentualImposto +
                '}';
    }

    public double valorCompra(){
        return valor * qtdProduto;
    }

    public double percentual(){
        return (valorCompra() * percentualImposto) / 100;
    }
}
