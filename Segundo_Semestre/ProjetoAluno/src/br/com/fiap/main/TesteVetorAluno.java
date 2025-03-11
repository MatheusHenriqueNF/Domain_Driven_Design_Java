package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;

public class TesteVetorAluno {

    // String
    static String texto(String j){

        return JOptionPane.showInputDialog(j);
    }

    // int
    static  int inteiro(String j){

        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double
    static double real (String j){

        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        // Determinar a quantidade maxima de vetores
        Aluno[] vetorAluno = new Aluno[2]; // [0] [1]

        // fazer o indice para controlar as posições
        int indice = 0;

        // Laço de repetição (entradas)
        do{
            vetorAluno[indice] = new Aluno();
            vetorAluno[indice].setRm(inteiro("Informe o RM"));
            vetorAluno[indice].setNome(texto("Nome do Aluno"));
            vetorAluno[indice].setTurma(texto("Turma"));
            vetorAluno[indice].setNota(real("Nota"));

            indice++;

        }while (  JOptionPane.showConfirmDialog(null,
                "Cadastrar mais Aluno?",
                "CADASTRO DE ALUNO",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE)   == 0);

       // Saidas utilizando "for"
        for(int contador = 0; contador < indice; contador++ ){
            System.out.println(
                   "\n\nRM: " + vetorAluno[contador].getRm() +
                   "\nNome: " + vetorAluno[contador].getNome() +
                   "\nTurma: " + vetorAluno[contador].getTurma() +
                   "\nNota: " + vetorAluno[contador].getNota()
            );
        }

    }

}
