package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;
import java.util.ArrayList;

public class TesteAlunoArrayList {

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
        ArrayList<Aluno> listaAluno = new ArrayList<>();

        Aluno objAluno = null;

        do {

            objAluno = new Aluno();
            objAluno.setNome(texto("Nome"));
            objAluno.setIdade(inteiro("Idade"));
            objAluno.setNota(real("Nota"));

            listaAluno.add(objAluno);

        }while (JOptionPane.showConfirmDialog(null, "Cadastrar aluno?", "CADASTRO ALUNO",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);

        for (Aluno a : listaAluno){
            System.out.println(
                    "\n\nNome: " + a.getNome() +
                            "\nIdade: " + a.getIdade() +
                            "\nNota: " + a.getNota()
            );
        }
    }
}
