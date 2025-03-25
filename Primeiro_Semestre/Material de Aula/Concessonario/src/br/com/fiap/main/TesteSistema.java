package br.com.fiap.main;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Concessonaria;

import javax.swing.*;

public class TesteSistema {

    static String texto(String x){
        return JOptionPane.showInputDialog(x);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String z){
        return Double.parseDouble(JOptionPane.showInputDialog(z));
    }

    public static void main(String[] args) {
        Concessonaria objConcessonaria = new Concessonaria(
                texto("Nome"),
                texto("Email"),
                texto("CNPJ"),
                inteiro("Qauntidade de colaboradores")
        );

        Carro objCarro = new Carro(
                inteiro("codiogo"),
                texto("marca"),
                texto("modelo"),
                real("Valor")
        );

        objConcessonaria.setCarro(objCarro);

        System.out.println(objConcessonaria);
    }

}
