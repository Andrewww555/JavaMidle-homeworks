package org.example.homework;

public class NightClub {
    private int places = 10; // Вместимость клуба — 10 человек
    private final FaceController faceController;

    public NightClub(FaceController faceController) {
        this.faceController = faceController;
    }

    // Пример метода для входа
    public boolean comeIn(Styles styles, boolean isFriday) {
        if (places < 1) {
            return false;
        }
        boolean solution = faceController.decide(styles, isFriday); // Передаём isFriday
        if (solution) {
            places--;
            return true;
        }
        return false;
    }

    // Пример метода для выхода
    public boolean comeOut(boolean haveDebt) {
        boolean solution = faceController.decide(haveDebt); // Проверяем задолженность через FaceController
        if (solution) {
            places++;
            return true;
        }
        return false;
    }
}