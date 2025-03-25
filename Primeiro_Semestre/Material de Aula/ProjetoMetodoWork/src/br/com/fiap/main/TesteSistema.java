package br.com.fiap.main;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

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

    public static void main(String[] args) {

        Colaborador objColaborador = new Colaborador(
                texto("Nome"),
                texto("Cargo"),
                real("valor hora"),
                real("quantidade de hora")
        );

        Endereco objEndereco = new Endereco(
                texto("Logradouro"),
                inteiro("numero"),
                texto("complemento"),
                texto("cep")
        );

        objColaborador.setEndereco(objEndereco);

        System.out.println(objColaborador);
        System.out.println(objEndereco);
        System.out.println("\n\nSalario total: " + objColaborador.salarioTotal());

    }

}
