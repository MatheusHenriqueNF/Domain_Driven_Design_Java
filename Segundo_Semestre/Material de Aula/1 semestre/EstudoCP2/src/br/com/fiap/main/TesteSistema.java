package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

import javax.swing.*;

public class TesteSistema {


    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    //String nome, double peso, int qtdProduto, double valor, int percentualImposto
    public static void main(String[] args) {
        Produto objProduto = new Produto(
                texto("Nome produto"),
                real("Peso"),
                inteiro("Quantidade produto"),
                real("Valor"),
                inteiro("Imposto")
        );
        Cliente objCliente = new Cliente(
                texto("Nome: ")
        );
        Colaborador objColaborador = new Colaborador(
                texto("Nome"),
                inteiro("Salario"),
                real("Percentual")
        );
        Endereco objEndCliente = new Endereco(
//                //String logrdouro, int numeor, String bairro
                texto("Logradouro:"),
                inteiro("Inteiro"),
                texto("Bairro")
        );
        Endereco objEndColaborador = new Endereco(
                texto("Logradouro:"),
                inteiro("Inteiro"),
                texto("Bairro")
        );

        objColaborador.setEndereco(objEndColaborador);
        objCliente.setEndereco(objEndCliente);



        System.out.println(
                "INFORMAÇÕES DO PRODUTO" +
                        objProduto
        );

        System.out.println(
                "Valor da compra" +
                        objProduto.valorCompra()
        );

        System.out.println(
                "Valor imposto" +
                        objProduto.percentual()
        );

        System.out.println(
                "CLIENTE" +
                        objCliente
        );

        System.out.println(
                "COLABORADOR" +
                        objColaborador
        );

    }



}
