package br.com.fiap.main;

import br.com.fiap.beans.Professor;

import javax.swing.*;
import java.util.ArrayList;

public class TesteProfessorArrayList {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro (String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real (String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        ArrayList<Professor> listaProfessor = new ArrayList<>();

        Professor objProfessor = null;

        do {

            objProfessor = new Professor();
            objProfessor.setNome(texto("Nome"));
            objProfessor.setRm(inteiro("RM"));
            objProfessor.setSalario(real("Salario"));

            listaProfessor.add(objProfessor);

        }while (JOptionPane.showConfirmDialog(null, "Cadastrar professor?", "CADASTRO PROFESSOR",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);

        for(Professor p : listaProfessor){
            System.out.println(
                    "\n\nNome: " + p.getNome() +
                            "\nRM: " + p.getRm() +
                            "\nSalario: " + p.getSalario()
            );
        }

    }
}
