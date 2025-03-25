package br.com.fiap.beans;

public class Cliente {
    private String nome;
    private Endereco endereco;
    private Produto produto;

    public Cliente() {
        super();
    }

    public Cliente(String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", produto=" + produto +
                '}';
    }
}
