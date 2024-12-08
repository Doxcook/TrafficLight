package view;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private Color redColor;
    private Color yellowColor;
    private Color greenColor;

    public Panel() {
        setPreferredSize(new Dimension(200, 400));
        setBackground(Color.BLACK);

        // Начальные цвета ламп
        redColor = Color.RED;
        yellowColor = Color.DARK_GRAY;
        greenColor = Color.DARK_GRAY;
    }

    public void updateLights(int state) {
        switch (state) {
            case 1 -> { // Красный
                redColor = Color.RED;
                yellowColor = Color.DARK_GRAY;
                greenColor = Color.DARK_GRAY;
            }
            case 2 -> { // Красный + Желтый
                redColor = Color.RED;
                yellowColor = Color.YELLOW;
                greenColor = Color.DARK_GRAY;
            }
            case 3 -> { // Зеленый
                redColor = Color.DARK_GRAY;
                yellowColor = Color.DARK_GRAY;
                greenColor = Color.GREEN;
            }
            case 4 -> { // Желтый
                redColor = Color.DARK_GRAY;
                yellowColor = Color.YELLOW;
                greenColor = Color.DARK_GRAY;
            }
        }
        repaint(); // Перерисовка панели
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Рисуем красную лампу
        g2d.setColor(redColor);
        g2d.fillOval(50, 30, 100, 100);

        // Рисуем желтую лампу
        g2d.setColor(yellowColor);
        g2d.fillOval(50, 140, 100, 100);

        // Рисуем зеленую лампу
        g2d.setColor(greenColor);
        g2d.fillOval(50, 250, 100, 100);
    }
}

