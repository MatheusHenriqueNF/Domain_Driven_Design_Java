package br.com.fiap.main;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

import javax.swing.*;

public class TesteSistema {

    static String text(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble((JOptionPane.showInputDialog(j)));
    }

    public static void main(String[] args) {
        Colaborador objColaborador = new Colaborador(
                text("Nome"),
                text("Cargo"),
                real("valor Hora"),
                real("quantidade hora"),
                real("percentual")
        );

        Empresa objEmpresa = new Empresa(
                text("Razao social"),
                text("CNPJ")
        );

        //String logradouro, int numero, String complemento, String cep
        Endereco objEndColaborador = new Endereco(
                text("Logradouro colaborador"),
                inteiro("Numero colaborador"),
                text("Complemento colaborador"),
                text("CEP colaborador")
        );

        Endereco objEndEmpresa = new Endereco(
                text("Logradouro empresa"),
                inteiro("Numero empresa"),
                text("Complemento empresa"),
                text("CEP empresa")
        );



        objColaborador.setEndereco(objEndColaborador);

        objEmpresa.setEndereco(objEndEmpresa);


        System.out.println(
                "INFORMAÇÕES DO COLABORADOR\n"+
                        objColaborador+"\n"+
                "INFORMAÇÕES DA EMPRESA\n"+
                        objEmpresa
        );

        System.out.println(
                objColaborador.salario()
        );

        System.out.println(
                objColaborador.impoostoRenda()
        );

        System.out.println(
                objColaborador.informacao()
        );
    }
}

