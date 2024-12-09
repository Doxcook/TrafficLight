package model;

public class Model {
    private static Model model;
    private int state; //  состояние светофора (1-4)

    private Model() {
        state = 4; // ачальное состояние
    }

    //Синглтон для модели (для того, чтобы модель была точно одна)
    public static Model getInstance() {
        if (model == null) {
            model = new Model();
        }
        return model;
    }

    //получить состояние
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    // переключение состояния, если не понятно смотреть файл СОСТОЯНИЕ
    public void switchToNextState() {
        state = (state % 4) + 1; //  переход (1 → 2 → 3 → 4 → 1)
    }
}


