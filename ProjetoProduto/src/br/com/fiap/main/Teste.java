package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;

public class Teste {

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

        Produto[] vetorProduto = new Produto[2];

        int indice = 0;

        do{
            vetorProduto[indice] = new Produto();
            vetorProduto[indice].setMarca(texto("Marca"));
            vetorProduto[indice].setTipo(texto("Texto"));
            vetorProduto[indice].setQuantidade(numero("Quantidade"));
            vetorProduto[indice].setValor(real("Valor"));

            indice++;

        } while(JOptionPane.showConfirmDialog(null,
                "Colocar mais intem?",
                "Carrinho de compras",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);

        for (int contador=0; contador < indice; contador++){
            System.out.println(
                    "Marca: " + vetorProduto[contador].getMarca() +
                            "\nTipo: " + vetorProduto[contador].getTipo() +
                            "\nQuantidade: " + vetorProduto[contador].getQuantidade() +
                            "\nVetor: " + vetorProduto[contador].getValor()
            );
        }
        }

    }

