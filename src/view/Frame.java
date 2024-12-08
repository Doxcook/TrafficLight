package view;

import javax.swing.*;

public class Frame extends JFrame {
    private Panel panel;

    public Frame() {
        setTitle("Traffic Light");
        setSize(200, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new Panel();
        add(panel);

        pack(); // Подгоняем размер окна под содержимое
        setVisible(true);
    }

    public Panel getPanel() {
        return panel;
    }
}
