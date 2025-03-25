package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

import javax.swing.*;

public class TesteSistema {

    public static void main(String[] args) {


        Cliente objCliente = new Cliente();
        Endereco objEndereco = new Endereco();
        Produto objProduto = new Produto();

        objCliente.setNome(JOptionPane.showInputDialog("Informe o nome do cliente:"));
        objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do cliente:")));
        objCliente.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Infome a altura do cliente:")));

        objEndereco.setLogradouro("Avenida marambaia");
        objEndereco.setNumero(111);
        objEndereco.setComplemento("Casa");
        objEndereco.setCep("02150-060");
        objEndereco.setBairro("Vila Baruel");
        objEndereco.setCidade("São Paulo");

        objCliente.setEndereco(objEndereco);

        objProduto.setCodigo(1);
        objProduto.setTipo("Tenis");
        objProduto.setMarca("Nike");
        objProduto.setValor(450);

        System.out.println(

                "Nome: " + objCliente.getNome() +
                "\nIdade: " + objCliente.getIdade() +
                "\nAltura: " + objCliente.getAltura() +
                "\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
                "\nNumero: " + objCliente.getEndereco().getNumero() +
                "\nComplemento: " + objCliente.getEndereco().getComplemento() +
                "\nCEP: " + objCliente.getEndereco().getCep() +
                "\nBairro: " + objCliente.getEndereco().getBairro() +
                "\nCidade: " + objCliente.getEndereco().getCidade() +
                "\nCodigo: " + objProduto.getCodigo() +
                "\nTipo: " + objProduto.getTipo() +
                "\nMarca: " + objProduto.getString() +
                "\nValor: " + objProduto.getValor()

        );


    }

}
