package br.com.fiap.main;


import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.ContaCorrente;
import br.com.fiap.beans.Endereco;

import javax.swing.*;

public class TesteProjeto {


    public static void main(String[] args) {


        Cliente objCliente = new Cliente();
        Endereco objEndereco = new Endereco();
        ContaCorrente objContaCorrente = new ContaCorrente();

        objCliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
        objCliente.setCpf(JOptionPane.showInputDialog("Digite o CPF do cliente"));

        objEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro"));
        objEndereco.setCidade(JOptionPane.showInputDialog("Digite a cidade"));
        objEndereco.setBairro(JOptionPane.showInputDialog("Digite o bairro"));
        objEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP"));
        objEndereco.setMunicipio(JOptionPane.showInputDialog("Digite o municipio"));
        objEndereco.setNacionalidade(JOptionPane.showInputDialog("Digite a nacionalidade"));
        objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da casa")));

        objContaCorrente.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")));

        System.out.println(

                "Nome: " + objCliente.getNome() +
                "\nCPF: " + objCliente.getCpf() +
                "Logradouro: " + objEndereco.getLogradouro() +
                "\nNumerop: " + objEndereco.getNumero() +
                "\nCEP: " + objEndereco.getCep() +
                "\nCidade: " + objEndereco.getCidade() +
                "\nMunicipio: " + objEndereco.getMunicipio() +
                "\nBairro: " + objEndereco.getBairro() +
                "\nNacionalidade: " + objEndereco.getNacionalidade() +
                "\nSaldo: " + objContaCorrente.getSaldo()

        );

    }


}
