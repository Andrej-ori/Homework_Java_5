package ru.netology.sqr;

public class SQRService {

    public int sqrCalc(int minRange, int maxRange){

        int counter = 0;

        for (int i = 10; i <=90; i++) {
            double sqr = Math.pow(i, 2);
            if (sqr >= minRange && sqr <= maxRange) counter++;
        }
        return counter;
    }

}