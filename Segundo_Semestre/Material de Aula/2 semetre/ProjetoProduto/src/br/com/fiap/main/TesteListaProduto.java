package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TesteListaProduto {

    // String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    // int
    static int numero(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        ArrayList<Produto> listaProduto = new ArrayList<Produto>();

        Produto objProduto = null;

        do{
            objProduto = new Produto();
            objProduto.setMarca(texto("Marca"));
            objProduto.setTipo(texto("Tipo"));
            objProduto.setQuantidade(numero("Quantidade"));
            objProduto.setValor(real("Valor"));

            listaProduto.add(objProduto);

        } while (JOptionPane.showConfirmDialog(null,
                "Colocar mais intem?",
                "Carrinho de compras",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);

        for(Produto p : listaProduto){
            System.out.println(
                    "\n\nMarca" + p.getMarca() +
                            "\nTipo: " + p.getTipo() +
                            "\nQuantidade: " + p.getQuantidade() +
                            "\nValor: " + p.getValor()
            );
        }

    }
}
