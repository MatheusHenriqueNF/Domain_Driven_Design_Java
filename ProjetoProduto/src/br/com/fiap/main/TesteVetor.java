package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;

public class TesteVetor {

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
        Produto[] vetorProduto = new Produto[4];

        int indice = 0;

        do{
            vetorProduto[indice] = new Produto();
            vetorProduto[indice].setCodigo(inteiro("Codigo"));
            vetorProduto[indice].setTipo(texto("Tipo"));
            vetorProduto[indice].setQuantidade(inteiro("Quantidade"));
            vetorProduto[indice].setValor(real("Valor"));

            indice++;
        } while (JOptionPane.showConfirmDialog(null, "Adicionar produtos mo carrinho?", "Carrinho DE COMPRAS",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        for(int contador = 0; contador < indice; contador++){
            System.out.println(
                    "\nCodigo: " + vetorProduto[contador].getCodigo() +
                            "\nTipo: " + vetorProduto[contador].getTipo() +
                            "\nMarca:" + vetorProduto[contador].getMarca() +
                            "\nQuantidade: " + vetorProduto[contador].getQuantidade() +
                            "\nValor: " + vetorProduto[contador].getValor()
            );
        }
    }
}
