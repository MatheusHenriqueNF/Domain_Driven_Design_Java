package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;

public class TesteProdutoVetor {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro (String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real (String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        Produto[] vetorProduto = new Produto[2];

        int indice = 0;

        do {


            vetorProduto[indice] = new Produto();
            vetorProduto[indice].setNome(texto("Nome"));
            vetorProduto[indice].setQtd(inteiro("Quantidade"));
            vetorProduto[indice].setPreco(real("Preço"));

            indice++;

        }while ( JOptionPane.showConfirmDialog(null, "Cadastrar produto?", "CADASTRO PRODUTO",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);

        for (int contador = 0; contador < indice; contador++){
            System.out.println(
                    "\n\nNome: " + vetorProduto[contador].getNome() +
                            "\nQuantidaede: " + vetorProduto[contador].getQtd() +
                            "\nPreço: " + vetorProduto[contador].getPreco()
            );
        }
    }
}
