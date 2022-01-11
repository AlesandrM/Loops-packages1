package ru.netology.sqr;

public class SQRService {


    public int square(int firstNumber, int secondNumber) {
        int counter = 0;

        for (int j = firstNumber; j < secondNumber; j++) {
            if (j * j >= 10 && j * j <= 99) {
                counter++;
            }
        }
        return counter;
    }
}
