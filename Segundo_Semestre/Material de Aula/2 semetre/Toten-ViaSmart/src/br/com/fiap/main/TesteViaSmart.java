package br.com.fiap.main;

import br.com.fiap.beans.MenuNavegacao;

import javax.swing.*;
import java.awt.*;

public class TesteViaSmart {
    public static void main(String[] args) {
        // Criando a janela
        JFrame janelaInicio = new JFrame("ViaSmart");
        janelaInicio.setSize(1900, 1000);
        janelaInicio.getContentPane().setBackground(new Color(77, 92, 187));
        janelaInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaInicio.setLocationRelativeTo(null);

        // Criando um painel principal para centralizar os componentes
        JPanel painelTexto = new JPanel();
        painelTexto.setLayout(new BoxLayout(painelTexto, BoxLayout.Y_AXIS));
        painelTexto.setBackground(new Color(77, 92, 187));
        painelTexto.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Criando o título
        JLabel titulo = new JLabel("Bem-vindo ao ViaSmart", JLabel.CENTER);
        titulo.setFont(new Font("Poppins", Font.BOLD, 80));
        titulo.setForeground(Color.white);
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Criando o subtítulo
        JLabel subtitulo = new JLabel("Encontre a melhor rota", JLabel.CENTER);
        subtitulo.setFont(new Font("Poppins", Font.BOLD, 40));
        subtitulo.setForeground(Color.white);
        subtitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Criando um botão para iniciar
        JButton botaoIniciar = new JButton("Toque para Iniciar");
        botaoIniciar.setFont(new Font("Poppins", Font.BOLD, 80));
        botaoIniciar.setForeground(new Color(77, 92, 187));
        botaoIniciar.setBackground(Color.white);
        botaoIniciar.setAlignmentX(Component.CENTER_ALIGNMENT); // Centralizando o botão

        // Adicionando ação ao botão
        botaoIniciar.addActionListener(e -> {
            janelaInicio.dispose(); // Fecha a tela inicial
            new MenuNavegacao(); // Abre o menu principal
        });

        // Adicionando componentes ao painel
        painelTexto.add(Box.createVerticalStrut(100)); // Espaço do topo
        painelTexto.add(titulo);
        painelTexto.add(Box.createVerticalStrut(20));
        painelTexto.add(subtitulo);
        painelTexto.add(Box.createVerticalStrut(40)); // Espaço antes do botão
        painelTexto.add(botaoIniciar);

        // Adicionando o painel à janela
        janelaInicio.setLayout(new GridBagLayout()); // Garante centralização total
        janelaInicio.add(painelTexto);
        janelaInicio.setVisible(true);
    }
}
