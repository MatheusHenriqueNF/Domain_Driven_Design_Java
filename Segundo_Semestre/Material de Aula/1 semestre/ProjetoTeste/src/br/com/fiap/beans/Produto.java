package br.com.fiap.beans;

public class Produto {

    private int codigo;
    private String tipo;
    private String marca;
    private int quantidade;
    private double valor;
    private double percetual;

    public Produto() {
        super();
    }

    public Produto(int codigo, String tipo, String marca, int quantidade, double valor, double percetual) {
        super();
        this.codigo = codigo;
        this.tipo = tipo;
        this.marca = marca;
        this.quantidade = quantidade;
        this.valor = valor;
        this.percetual = percetual;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPercetual() {
        return percetual;
    }

    public void setPercetual(double percetual) {
        this.percetual = percetual;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                ", percetual=" + percetual +
                '}';
    }

    public double valorTotal(){
        return quantidade * valor;
    }

    public double desconto(){
        return (valorTotal() * percetual) / 100;
    }
}
