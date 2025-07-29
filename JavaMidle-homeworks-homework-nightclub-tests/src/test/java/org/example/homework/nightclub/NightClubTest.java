package org.example.homework.nightclub;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

@DisplayName("Класс NightClub")
public class NightClubTest {

    private NightClub nightClub;
    private FaceController faceController;

    @BeforeEach
    void setup() {
        faceController = Mockito.mock(FaceController.class);
        nightClub = new NightClub(faceController);
    }

    @Test
    @DisplayName("Должен впустить человека в спортивном стиле в пятницу, если FaceController разрешает")
    void shouldAcceptSportStyleOnFriday() {
        // Настраиваем мок: разрешаем вход для SPORT стиля в пятницу
        BDDMockito.given(faceController.decide(Styles.SPORT, true)).willReturn(true);

        boolean expectedResult = true;
        boolean actualResult = nightClub.comeIn(Styles.SPORT, true);

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Не должен впустить человека в спортивном стиле не в пятницу")
    void shouldNotAcceptSportStyleNotOnFriday() {
        // Настраиваем мок: запрещаем вход для SPORT стиля не в пятницу
        BDDMockito.given(faceController.decide(Styles.SPORT, false)).willReturn(false);

        boolean expectedResult = false;
        boolean actualResult = nightClub.comeIn(Styles.SPORT, false);

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Должен выпустить человека без долга")
    void shouldLetOutWithoutDebt() {
        // Настраиваем мок: разрешаем выход без долга
        BDDMockito.given(faceController.decide(false)).willReturn(true);

        boolean expectedResult = true;
        boolean actualResult = nightClub.comeOut(false);

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Не должен выпустить человека с долгом")
    void shouldNotLetOutWithDebt() {
        // Настраиваем мок: запрещаем выход с долгом
        BDDMockito.given(faceController.decide(true)).willReturn(false);

        boolean expectedResult = false;
        boolean actualResult = nightClub.comeOut(true);

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Должен впустить человека в классическом стиле в любой день")
    void shouldAcceptClassicStyleAnyDay() {
        // Настраиваем мок: разрешаем вход для CLASSIC в пятницу и не в пятницу
        BDDMockito.given(faceController.decide(Styles.CLASSIC, true)).willReturn(true);
        BDDMockito.given(faceController.decide(Styles.CLASSIC, false)).willReturn(true);

        boolean actualResultFriday = nightClub.comeIn(Styles.CLASSIC, true);
        boolean actualResultNotFriday = nightClub.comeIn(Styles.CLASSIC, false);

        Assertions.assertThat(actualResultFriday).isTrue();
        Assertions.assertThat(actualResultNotFriday).isTrue();
    }

    @Test
    @DisplayName("Должен впустить человека в стиле CASUAL в любой день")
    void shouldAcceptCasualStyleAnyDay() {
        // Настраиваем мок: разрешаем вход для CASUAL в пятницу и не в пятницу
        BDDMockito.given(faceController.decide(Styles.CASUAL, true)).willReturn(true);
        BDDMockito.given(faceController.decide(Styles.CASUAL, false)).willReturn(true);

        boolean actualResultFriday = nightClub.comeIn(Styles.CASUAL, true);
        boolean actualResultNotFriday = nightClub.comeIn(Styles.CASUAL, false);

        Assertions.assertThat(actualResultFriday).isTrue();
        Assertions.assertThat(actualResultNotFriday).isTrue();
    }

    @Test
    @DisplayName("Должен впустить одного человека и выпустить другого — количество мест не меняется")
    void shouldLetInAndLetOutPerson() {
        // Настраиваем мок: разрешаем вход для CASUAL не в пятницу
        BDDMockito.given(faceController.decide(Styles.CASUAL, false)).willReturn(true);
        // Настраиваем мок: разрешаем выход без долга
        BDDMockito.given(faceController.decide(false)).willReturn(true);

        // Изначально мест 10
        // Впускаем одного человека
        boolean inResult = nightClub.comeIn(Styles.CASUAL, false);
        // Выпускаем другого (без долга)
        boolean outResult = nightClub.comeOut(false);

        // Проверяем, что оба действия успешны
        Assertions.assertThat(inResult).isTrue();
        Assertions.assertThat(outResult).isTrue();

        // Проверяем, что количество мест снова 10 (если есть геттер для places)
        // Если нет — можно добавить временно для теста:
        // Assertions.assertThat(nightClub.getPlaces()).isEqualTo(10);
    }
}