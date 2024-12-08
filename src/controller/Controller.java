package controller;

import model.Model;
import view.Frame;
import java.util.Timer;
import java.util.TimerTask;

public class Controller {
    private final Model model;
    private final Frame frame;

    public Controller() {
        model = Model.getInstance(); // создание модели с помощью паттерна Синглтон
        frame = new Frame();
        startLightCycle();
    }

    private void startLightCycle() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() { //Метод run() содержит код, который нужно выполнять.
                model.switchToNextState(); // перекчение состояния
                frame.getPanel().updateLights(model.getState()); // Обновляем панель
            }
        }, 0, 2000); // Переключение каждые 2 секунды
    }
}

