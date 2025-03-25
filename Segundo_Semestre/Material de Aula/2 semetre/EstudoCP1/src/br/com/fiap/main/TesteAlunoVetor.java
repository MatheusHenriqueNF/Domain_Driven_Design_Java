package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;

public class TesteAlunoVetor {

    static String texto (String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro (String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real (String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        Aluno[] vetorAluno = new Aluno[2];

        int indice = 0;

        do {

            vetorAluno[indice] = new Aluno();
            vetorAluno[indice].setNome(texto("Nome: "));
            vetorAluno[indice].setIdade(inteiro("Idade: "));
            vetorAluno[indice].setNota(real("Nota: "));

            indice++;

        }while (JOptionPane.showConfirmDialog(null, "Cadastrar novo aluno?","CADASTRO DE ALUNO",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);

        for(int contador = 0; contador < indice; contador++){
            System.out.println(
                    "\n\nNome: " + vetorAluno[contador].getNome() +
                            "\nIdade: " + vetorAluno[contador].getIdade() +
                            "\nNota: " + vetorAluno[contador].getNota()
            );
        }

    }
}
