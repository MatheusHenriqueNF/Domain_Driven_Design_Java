package br.com.fiap.main;

import br.com.fiap.beans.Carro;

import javax.swing.*;

public class TesteCarroVetor {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static  double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }


    public static void main(String[] args) {

        Carro[] vetorCarro = new Carro[2];

        int indice = 0;

        do {

            vetorCarro[indice] = new Carro();
            vetorCarro[indice].setModelo(texto("Modelo"));
            vetorCarro[indice].setAno(inteiro("Ano"));
            vetorCarro[indice].setPreco(real("Preço"));

            indice ++;

        }while ( JOptionPane.showConfirmDialog(null, "Cadastrar novo carro?", "CADASTRO DE CARRO",
               JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE )==0);

        for (int contador = 0; contador < indice; contador++){
            System.out.println(
                    "\n\nModelo: " + vetorCarro[contador].getModelo() +
                            "\nAno: " + vetorCarro[contador].getAno() +
                            "\nPreço: " + vetorCarro[contador].getPreco()
            );
        }
    }
}
