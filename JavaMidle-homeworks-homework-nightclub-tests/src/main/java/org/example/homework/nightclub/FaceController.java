package org.example.homework.nightclub;

public class FaceController {

    // Проверка по стилю одежды и дню недели
    public boolean decide(Styles styles, boolean isFriday) {
        switch (styles) {
            case SPORT:
                return isFriday; // В спортивном стиле только в пятницу
            case CASUAL:
            case CLASSIC:
                return true; // В других стилях всегда можно
            default:
                return false;
        }
    }

    // Проверка по задолженности
    public boolean decide(boolean haveDebt) {
        return !haveDebt;
    }
}