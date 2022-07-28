package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQR.csv")

    void testSQRService(int minRange, int maxRange, int expected) {

        SQRService service = new SQRService();

        int actual = service.sqrCalc(minRange, maxRange);

        Assertions.assertEquals(expected, actual);
    }
}