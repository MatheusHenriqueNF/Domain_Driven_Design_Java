package br.com.fiap.beans;

public class Professor {
    private String nome;
    private int rm;
    private double salario;

    public Professor() {
        super();
    }

    public Professor(String nome, int rm, double salario) {
        super();
        this.nome = nome;
        this.rm = rm;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", rm=" + rm +
                ", salario=" + salario +
                '}';
    }
}
