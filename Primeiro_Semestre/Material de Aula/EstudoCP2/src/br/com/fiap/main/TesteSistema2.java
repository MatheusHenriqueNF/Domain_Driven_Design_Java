package br.com.fiap.main;

import br.com.fiap.beans2.Colaborador2;
import br.com.fiap.beans2.Empresa2;
import br.com.fiap.beans2.Endereco2;

import javax.swing.*;

public class TesteSistema2 {

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
        Colaborador2 objColaborador2 = new Colaborador2(
                texto("Nome: "),
                texto("Cargo: "),
                real("Valor hora"),
                real("Quantidade de hora"),
                real("Percentual")
        );

        Empresa2 objEmpresa = new Empresa2(
                texto("Nome"),
                texto("Razao Social"),
                texto("CNPJ")
        );

        Endereco2 objEndColaborador = new Endereco2(
                texto("Lograoduro Colaborador"),
                inteiro("Numeor Colaborador"),
                texto("Complemento Colaborador"),
                texto("CEP Colaborador")
        );

        Endereco2 objEndEmpresa = new Endereco2(
                texto("Lograoduro Empresa"),
                inteiro("Numeor Empresa"),
                texto("Complemento Empresa"),
                texto("CEP Empresa")
        );

        objColaborador2.setEndereco2(objEndColaborador);
        objEmpresa.setEndereco2(objEndEmpresa);

        System.out.println(
                "INFORMAÇÃO COLABORADOR0" +
                        objColaborador2 + "\nSALARIO: " + objColaborador2.salario2() + "\nIMPOSTO DE RENDA: "+ objColaborador2.imposto() + "\nINFORMAÇAO: "+ objColaborador2.informacao()+
                "\n\nINFORMAÇÃO EMPRESA" +
                        objEmpresa
        );
    }


}
