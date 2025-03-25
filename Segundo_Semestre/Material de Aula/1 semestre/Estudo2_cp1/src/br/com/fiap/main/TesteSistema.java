package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.ContaCorrente;
import br.com.fiap.beans.Endereco;

import javax.swing.*;

public class TesteSistema {

    public static void main(String[] args) {

        Cliente objCliente = new Cliente();
        Colaborador objColaborador = new Colaborador();

        Endereco objEndClie = new Endereco();
        Endereco objEndCola = new Endereco();

        ContaCorrente objContaCorrente = new ContaCorrente();

        objCliente.setNome(JOptionPane.showInputDialog("Nome"));
        objCliente.setCpf(JOptionPane.showInputDialog("CPF"));

        objColaborador.setNome(JOptionPane.showInputDialog("Nome colaborador"));
        objColaborador.setCpf(JOptionPane.showInputDialog("CPF colaborador"));

        objEndClie.setLogradouro(JOptionPane.showInputDialog("Logradouro"));
        objEndClie.setMunicipio(JOptionPane.showInputDialog("Municipio"));
        objEndClie.setCep(JOptionPane.showInputDialog("CEP"));
        objEndClie.setBairro(JOptionPane.showInputDialog("Bairro"));
        objEndClie.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero")));
        objEndClie.setCidade(JOptionPane.showInputDialog("Cidade"));
        objEndClie.setNacionalidade(JOptionPane.showInputDialog("Nacionalidade"));

        obj

        objContaCorrente.setSaldo(Integer.parseInt(JOptionPane.showInputDialog("Saldo")));





    }

}
