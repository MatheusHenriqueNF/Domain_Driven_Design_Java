package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

import javax.swing.*;

public class TesteSistema {

    public static void main(String[] args) {

        Cliente objCliente = new Cliente();
        Colaborador objColaborador = new Colaborador();
        Endereco objEndCliente = new Endereco();
        Endereco objEndColaborador = new Endereco();

        objCliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
        objCliente.setCpf(JOptionPane.showInputDialog("Digite o cpf do cliente"));
        objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digita a idade do cliente")));
        objCliente.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do cliente")));

        objEndCliente.setLogradouro(JOptionPane.showInputDialog("Informe o logradouro do cliente"));
        objEndCliente.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do casa do cliente")));
        objEndCliente.setComplemento(JOptionPane.showInputDialog("Digite o complemento"));
        objEndCliente.setCep(JOptionPane.showInputDialog("Digite o cep do cliente"));
        objEndCliente.setBairro(JOptionPane.showInputDialog("Digite o bairro"));
        objEndCliente.setCidade(JOptionPane.showInputDialog("Digite a cidade do cliente"));

        objCliente.setEndereco(objEndCliente);

        System.out.println(
                "Nome: " + objCliente.getNome() +
                "\nCPF: " + objCliente.getCpf() +
                "\nIdade: " + objCliente.getIdade() +
                "\nAltura: " + objCliente.getAltura() +
                "\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
                "\nNumero: " + objCliente.getEndereco().getNumero() +
                "\nComplemnto: " +objCliente.getEndereco().getComplemento()
        );
    }
}
