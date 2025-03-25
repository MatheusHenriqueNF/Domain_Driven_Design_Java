package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;
import java.util.ArrayList;

public class TesteArrayListAluno {

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

        // Preparar a Lista  <>
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();

        // Preparar objeto null
        Aluno objAluno = null;

        // Laço de repetição (entrada)
        do {
            objAluno = new Aluno();
            objAluno.setRm(inteiro("RM"));
            objAluno.setNome(texto("Nome"));
            objAluno.setTurma(texto("Turma"));
            objAluno.setNota(real("Nota"));

            listaAluno.add(objAluno);

        }while( JOptionPane.showConfirmDialog(null,
                "Cadastrar mais Aluno?",
                "CADASTRO DE ALUNO",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE)  == 0 );

         // Saidas utilizando "foreach"
         for(Aluno a : listaAluno){
             System.out.println(
                     "\n\nRM: " + a.getRm()  +
                     "\nNome: " + a.getNome()  +
                     "\nTurma: " + a.getTurma() +
                     "\nNota: " + a.getNota()
             );
         }


    }

}
