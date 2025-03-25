package br.com.fiap.main;

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

    public static void main(String[] args) {
//int codigo, String tipo, String marca, int quantidade, double valor, double percetual
        Produto objProduto = new Produto(
                inteiro("Codigo do prdouto"),
                texto("Tipoe"),
                texto("Marca"),
                inteiro("Quantidade"),
                real("Valor"),
                real("Percentual")

        );

        System.out.println(
                "INFORMAÇÕES DO PRODUTO \n" +
                        objProduto
        );

        System.out.println(
                "\n\nVALOR TOTAL: " + objProduto.valorTotal()
        );

        System.out.println("\n\nVALOR DE DESCONTO: " + objProduto.desconto());

    }

}
