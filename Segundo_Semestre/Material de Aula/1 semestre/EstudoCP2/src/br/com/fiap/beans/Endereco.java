package br.com.fiap.beans;

public class Endereco {
    private String logrdouro;
    private int numeor;
    private String bairro;

    public Endereco() {
        super();
    }

    public Endereco(String logrdouro, int numeor, String bairro) {
        super();
        this.logrdouro = logrdouro;
        this.numeor = numeor;
        this.bairro = bairro;
    }

    public String getLogrdouro() {
        return logrdouro;
    }

    public void setLogrdouro(String logrdouro) {
        this.logrdouro = logrdouro;
    }

    public int getNumeor() {
        return numeor;
    }

    public void setNumeor(int numeor) {
        this.numeor = numeor;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logrdouro='" + logrdouro + '\'' +
                ", numeor=" + numeor +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
