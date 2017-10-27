package com.nikita;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{

    private static int width = 300;
    private static int height = 400;
    private static String nameOne = "1";
    private static String nameTwo = "2";

    private JPanel panelOne;
    private JButton begin;

    public Window() {
        createWindow();
    }

    private void createWindow() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        panelOne = new JPanel();
        begin = new JButton("Начать");



        setTitle(nameOne + " и " + nameTwo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension(width, height);
        setSize(dimension);
        setLocationRelativeTo(null);
        add(begin, BorderLayout.NORTH);


        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}
