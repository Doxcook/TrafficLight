package view;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private Color redColor; //красный круг
    private Color yellowColor; //желтый круг
    private Color greenColor; //зеленый круг

    public Panel() {
        setBackground(Color.BLACK); //черный фон, чисто для красоты

        redColor = Color.RED;
        yellowColor = Color.DARK_GRAY;
        greenColor = Color.DARK_GRAY;
    }

    //обновление цвета, зависящее от состояния
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
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(redColor);
        g2d.fillOval(50, 30, 100, 100);

        g2d.setColor(yellowColor);
        g2d.fillOval(50, 140, 100, 100);

        g2d.setColor(greenColor);
        g2d.fillOval(50, 250, 100, 100);
    }
}

