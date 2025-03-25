package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String nome, String email, double renda, String cnpj){
        super(nome, email, renda);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                "} " + super.toString();
    }
}
