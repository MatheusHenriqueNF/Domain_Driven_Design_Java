package br.com.fiap.main;

import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

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

        PessoaFisica objPF = new PessoaFisica(
                texto("Nome PF"),
                texto("Email PF"),
                real("Renda PF"),
                texto("RG"),
                texto("CPF")
        );

        PessoaJuridica objPJ = new PessoaJuridica(
                texto("Nome PF"),
                texto("Email PF"),
                real("Renda PF"),
                texto("CNPJ")
        );

        System.out.println(objPF);
        System.out.println(objPJ);

    }

}
