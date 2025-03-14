package br.com.fiap.main;

import br.com.fiap.beans.Carro;

import javax.swing.*;
import java.util.ArrayList;

public class TesteCarroArrayList {

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

        ArrayList<Carro> listaCarro = new ArrayList<>();

        Carro objCarro = null;

        do {

            objCarro = new Carro();
            objCarro.setNome(texto("Nome"));
            objCarro.setAno(inteiro("Ano"));
            objCarro.setPreco(real("Preço"));

            listaCarro.add(objCarro);

        }while (JOptionPane.showConfirmDialog(null, "Cadastar carro?", "CADASTRO CARRO",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);

        for (Carro c : listaCarro){
            System.out.println(
                    "\n\nNome: " + c.getNome() +
                            "\nAno: " + c.getAno() +
                            "\nPreço: " + c.getPreco()
            );
        }
    }
}
