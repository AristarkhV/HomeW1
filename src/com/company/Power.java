package com.company;
public class Power extends Service {
    static double getPower(int number, int power) {
        double result = 1;
        for (int i = 1; i <= Math.abs(power); i++)
            result = result * number;
        if (power < 0)
            result = 1 / result;
        return result;
    }
}
