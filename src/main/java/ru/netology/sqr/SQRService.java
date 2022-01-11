package ru.netology.sqr;

public class SQRService {


    public int square(int firstNumber, int secondNumber) {
        int counter = 0;

        for (int j = 10; j < 100; j++) {
            if (j * j >= firstNumber && j * j <= secondNumber) {
                counter++;
            }
        }
        return counter;
    }
}
