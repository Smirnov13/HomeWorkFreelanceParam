package ru.netology.HomeWorkFreelance.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class AccountMoneyServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/paramtest.csv")

    public void homeWorkParamTask(int expected, int income, int expense, int threshold) {
        AccountMoneyService service = new AccountMoneyService();


        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }


}