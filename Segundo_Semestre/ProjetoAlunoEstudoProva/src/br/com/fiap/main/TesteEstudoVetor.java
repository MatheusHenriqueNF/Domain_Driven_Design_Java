package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;

public class TesteEstudoVetor {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return  Integer.parseInt(JOptionPane.showInputDialog(j));
    }

   static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }


    public static void main(String[] args) {
        Aluno[] vetorAluno = new Aluno[2];

        int indice = 0;

        do {

            vetorAluno[indice] = new Aluno();
            vetorAluno[indice].setNome(texto("Informe o nome"));
            vetorAluno[indice].setRm(inteiro("Informe o RM"));
            vetorAluno[indice].setTurma(texto("Informe a turma"));
            vetorAluno[indice].setNota(real("Informe a nota"));

        }while ( JOptionPane.showConfirmDialog(null,
                "Deseja cadastrar um novo aluno?",
                "CADASTRAR NOVO ALUNO",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);

            for(int contador = 0; contador < indice; contador++){
                System.out.println(
                        "\n\nRM: " + vetorAluno[contador].getRm() +
                                "\nNome: " + vetorAluno[contador].getNome() +
                                "\nTurma: " + vetorAluno[contador].getTurma() +
                                "\nNota: " + vetorAluno[contador].getNota()
                );
        }


    }
}
