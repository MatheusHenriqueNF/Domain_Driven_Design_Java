package br.com.fiap.beans2;

public class Empresa2 {
    private String nome;
    private String razaoSocial;
    private String cpnj;
    private Endereco2 endereco2;

    public Empresa2() {
        super();
    }

    public Empresa2(String nome, String razaoSocial, String cpnj) {
        super();
        this.nome = nome;
        this.razaoSocial = razaoSocial;
        this.cpnj = cpnj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    public Endereco2 getEndereco2() {
        return endereco2;
    }

    public void setEndereco2(Endereco2 endereco2) {
        this.endereco2 = endereco2;
    }

    @Override
    public String toString() {
        return "Empresa2{" +
                "nome='" + nome + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cpnj='" + cpnj + '\'' +
                ", endereco2=" + endereco2 +
                '}';
    }
}
