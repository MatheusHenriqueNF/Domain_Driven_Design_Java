package br.com.fiap.beans;

import javax.swing.*;
import java.awt.*;

public class MenuNavegacao {
    public MenuNavegacao() {
        // Criando a janela do menu
        JFrame menuFrame = new JFrame("Menu Principal");
        menuFrame.setSize(1900, 1000);
        menuFrame.getContentPane().setBackground(new Color(77, 92, 187));
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setLocationRelativeTo(null);
        menuFrame.setLayout(new GridLayout(3, 1, 10, 10)); // Layout de grade com 3 botões

        // Criando botões do menu
        JButton btnRota = new JButton("Consultar Rota");
        btnRota.setFont(new Font("Poppins", Font.BOLD, 80));
        btnRota.setForeground(new Color(77, 92, 187));
        btnRota.setBackground(Color.white);
        btnRota.setPreferredSize(new Dimension(500, 100)); // Largura: 500px, Altura: 100px
        btnRota.setAlignmentX(Component.CENTER_ALIGNMENT); // Centralizando o botão

        JButton btnDuvidas = new JButton("Informações de Linhas");
        JButton btnAjuda = new JButton("Ajuda");

        // Adicionando ações aos botões
        btnRota.addActionListener(e -> abrirTela("Encontrar Rota"));
        btnDuvidas.addActionListener(e -> abrirTela("Dúvidas"));
        btnAjuda.addActionListener(e -> abrirTela("Ajuda"));

        // Adicionando os botões ao menu
        menuFrame.add(btnRota);
        menuFrame.add(btnDuvidas);
        menuFrame.add(btnAjuda);

        menuFrame.setVisible(true);
    }

    // Método para abrir uma nova tela com base no botão clicado
    private void abrirTela(String titulo) {
        JFrame novaTela = new JFrame(titulo);
        novaTela.setSize(100, 300);
        novaTela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas essa tela
        novaTela.setLocationRelativeTo(null);

        JLabel label = new JLabel(titulo, JLabel.CENTER);
        label.setFont(new Font("Poppins", Font.BOLD, 80));

        novaTela.add(label);
        novaTela.setVisible(true);
    }
}
