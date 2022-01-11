package ru.netology.sqr;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "'Square calculate, between numbers 200 and 300',200, 300, 0",
            "'Square calculate, between numbers 0 and 256',0,256,6",
            "'Square calculate, between numbers 15 and 225',15,225,0",
            "'Square calculate, between numbers 10 and 300',16,300,0"
    }
    )
    public void shouSquareCalculate(String test, int firstNumber, int secondNumber, int expected) {
        SQRService service = new SQRService();


        int square = service.square(firstNumber, secondNumber);

        assertEquals(expected, square);

    }
}








