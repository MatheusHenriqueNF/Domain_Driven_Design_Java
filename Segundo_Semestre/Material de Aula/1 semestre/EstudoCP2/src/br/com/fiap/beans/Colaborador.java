package br.com.fiap.beans;

public class Colaborador {

    private String nome;
    private int salario;
    private double percentual;
    private Endereco endereco;


    public Colaborador() {
        super();
    }

    public Colaborador(String nome, int salario, double percentual) {
        super();
        this.nome = nome;
        this.salario = salario;
        this.percentual = percentual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
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

    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", percentual=" + percentual +
                ", endereco=" + endereco +
                '}';
    }
}
