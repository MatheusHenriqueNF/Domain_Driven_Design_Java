package br.com.fiap.beans;

public class Colaborador {

    private String nome;
    private String cargo;
    private double valorHora;
    private double qtdHoras;
    private double percentual;
    private Endereco endereco;

    public Colaborador() {
        super();
    }

    public Colaborador(String nome, String cargo, double valorHora, double qtdHoras, double percentual) {
        super();
        this.nome = nome;
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.qtdHoras = qtdHoras;
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

    public double getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(double qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double salario(){
        return valorHora * qtdHoras;
    }

    public double impoostoRenda(){
        return (salario() * percentual) /100;
    }

    public String informacao(){
        String info = null;
        if (salario() < 3500){
            info = "abaixo de 3500";
        }
        else{
            info = "acima de 3500";
        }

        return info;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", valorHora=" + valorHora +
                ", qtdHoras=" + qtdHoras +
                ", percentual=" + percentual +
                ", endereco=" + endereco+
                '}';
    }
}
