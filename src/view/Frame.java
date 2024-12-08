package view;

import javax.swing.*;

public class Frame extends JFrame {
    private Panel panel;

    public Frame() {
        //настройки рамки
        setTitle("Светофор");
        setSize(200, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        //добавление панели светофора
        panel = new Panel();
        add(panel);

    }

    public Panel getPanel() {
        return panel;
    }
}
