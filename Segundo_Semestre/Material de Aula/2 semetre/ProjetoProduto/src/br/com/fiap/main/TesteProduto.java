package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;

public class TesteProduto {

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
        Produto objProduto = new Produto();

        objProduto.setCodigo(inteiro("Codigo"));
        objProduto.setTipo(texto("Tipo"));
        objProduto.setQuantidade(inteiro("Quantidade"));
        objProduto.setMarca(texto("Marca"));
        objProduto.setValor(real("Valor"));

        System.out.println(objProduto);

        System.out.println(objProduto.valorTotal());
    }
}
