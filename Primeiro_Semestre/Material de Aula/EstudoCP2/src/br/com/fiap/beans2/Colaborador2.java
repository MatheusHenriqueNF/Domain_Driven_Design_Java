package br.com.fiap.beans2;

import br.com.fiap.beans.Endereco;

public class Colaborador2 {
    private String nome;
    private String cargo;
    private double valorHora;
    private double qtdHora;
    private double percentual;
    private Endereco2 endereco2;

    public Colaborador2() {
        super();
    }

    public Colaborador2(String nome, String cargo, double valorHora, double qtdHora, double percentual) {
        super();
        this.nome = nome;
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.qtdHora = qtdHora;
        this.percentual = percentual;
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

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public Endereco2 getEndereco2() {
        return endereco2;
    }

    public void setEndereco2(Endereco2 endereco2) {
        this.endereco2 = endereco2;
    }

    public double salario2(){
        return valorHora * qtdHora;
    }

    public double imposto(){
        return (salario2() * percentual) /100;
    }

    public String informacao(){
        String info = null;
        if (salario2() > 3500){
            info = "Salario superior 3500";
        }
        else{
            info = "Salario inferior 3500";
        }

        return info;
    }

    @Override
    public String toString() {
        return "Colaborador2{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", valorHora=" + valorHora +
                ", qtdHora=" + qtdHora +
                ", percentual=" + percentual +
                ", endereco=" + endereco2 +
                '}';
    }
}
