package ru.netology.javaqa.schedule.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ScheduleServiceTest {
    @ParameterizedTest
  /*  @CsvSource({
            "3, 10000, 3000, 20000",
            "2, 100000, 60000, 150000"
    })*/
    @CsvFileSource (files="src/test/resources/schedule.csv")
    void shouldCalculateVacationMonths(int expected, int income, int expenses, int threshold) {
        ScheduleService service = new ScheduleService();
 //       int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}
