package br.com.fiap.beans;

public class Produto {
    private int codigo;
    private String tipo;
    private String marca;
    private int quantidade;
    private double valor;

    public Produto(){
        super();
    }

    public Produto(int codigo, String tipo, String marca, int quantidade, double valor) {
        super();
        this.codigo = codigo;
        this.tipo = tipo;
        this.marca = marca;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                '}';
    }

    public double valorTotal(){
        return valor * quantidade;
    }
}
