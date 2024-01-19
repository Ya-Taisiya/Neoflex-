package ru.neoflex.practice.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.neoflex.practice.Controller.CalcController;

public class CalcControllerTest {
    @Test
    void plus() {
        CalcController CalcController = new CalcController();
        int plus = CalcController.plus(16, 20);
        Assertions.assertEquals(36, plus);
    }
}
