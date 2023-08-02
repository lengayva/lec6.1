package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class FreelanceServiceTestCSV {

    @ParameterizedTest
    @CsvFileSource(resources = "/TestData.csv")
    public void testCSV(int income, int expenses, int threshold, int expected){
        FreelanceService service = new FreelanceService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}